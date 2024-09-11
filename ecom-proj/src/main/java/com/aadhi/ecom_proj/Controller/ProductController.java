package com.aadhi.ecom_proj.Controller;

import com.aadhi.ecom_proj.Model.Product;
import com.aadhi.ecom_proj.Service.ProductServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    private final ProductServices service;

    public ProductController(ProductServices service) {
        this.service = service;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductsById(@PathVariable long id) {
        Product product = service.getProductsById(id);
        if (product != null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProducts(@RequestPart("product") Product product,
                                         @RequestPart("imageFile") MultipartFile imageFile) {
        try
        {
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImageById(@PathVariable Long productId)
    {
        Product product = service.getProductsById(productId);
        byte[] imageFile = product.getImageData();
        return ResponseEntity.ok().
                contentType(MediaType.valueOf(product.getImageType()))
                .body(imageFile);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable Long productId,@RequestPart("product") Product product,
                                                @RequestPart("imageFile") MultipartFile imageFile)
    {
        Product updatePro = null;

        try
        {
            updatePro = service.updateProduct(productId,product,imageFile);
        }

        catch (IOException e)
        {
            return new ResponseEntity<>("Failed to Update",HttpStatus.BAD_REQUEST);
        }

        if(updatePro!=null)
        {
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Failed to Update",HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable Long id )
    {
        String product = service.deleteProductById(id);
        if(product!=null)
            return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
        else
            return new ResponseEntity<>("Product not found",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword)
    {
        System.out.println("searching with : "+keyword);
        List<Product> product = service.searchProduct(keyword);
        return new ResponseEntity<>(product,HttpStatus.OK);

    }
}
