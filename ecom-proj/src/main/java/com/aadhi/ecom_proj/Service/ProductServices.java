package com.aadhi.ecom_proj.Service;

import com.aadhi.ecom_proj.Model.Product;
import com.aadhi.ecom_proj.Repo.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServices {
    private final ProductRepo repo;

    public ProductServices(ProductRepo repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductsById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return repo.save(product);
    }

    public Product updateProduct(Long productId, Product product, MultipartFile imageFile) throws IOException
    {
        product.setImageData(imageFile.getBytes());
        product.setImageType(imageFile.getContentType());
        product.setImageName(imageFile.getOriginalFilename());
        return repo.save(product);
    }

    public String deleteProductById(Long id)
    {
        repo.deleteById(id);
        return "";
    }

    public List<Product> searchProduct(String keyword)
    {
        return repo.searchProduct(keyword);

    }
}
