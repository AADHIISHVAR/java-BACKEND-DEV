package com.aadhi.ecom_proj.Config;

import com.aadhi.ecom_proj.Model.Product;
import com.aadhi.ecom_proj.Repo.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;


@Configuration
public class ProductConfig
{
    @Bean
    public CommandLineRunner  loadData(ProductRepo repository)
    {
        return args ->
        {
//            repository.save(new Product(1L, "Toyota", "2024 Toyota Camry with advanced safety features.", "Toyota", 28000, "Sedan", LocalDate.of(2024, 1, 15), true, 10, null, null, null));
//            repository.save(new Product(2L, "Honda", "2024 Honda CR-V with spacious interior and modern technology.", "Honda", 32000, "SUV", LocalDate.of(2024, 2, 20), true, 8, null, null, null));
//            repository.save(new Product(3L, "Ford", "2024 Ford F-150 with high towing capacity and rugged design.", "Ford", 35000, "Truck", LocalDate.of(2024, 3, 10), true, 5, null, null, null));
//            repository.save(new Product(4L, "Chevrolet", "2024 Chevrolet Camaro with powerful performance and stylish look.", "Chevrolet", 33000, "Coupe", LocalDate.of(2024, 4, 5), true, 7, null, null, null));
//            repository.save(new Product(5L, "BMW", "2024 BMW Z4 with sporty handling and premium features.", "BMW", 50000, "Convertible", LocalDate.of(2024, 5, 22), true, 4, null, null, null));

        };
    }
}
