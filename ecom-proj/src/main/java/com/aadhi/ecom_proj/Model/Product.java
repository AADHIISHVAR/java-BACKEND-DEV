package com.aadhi.ecom_proj.Model;
import jakarta.persistence.Lob;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.time.LocalDate;

@Data
@Entity
@Builder
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor

public class Product
{
    @Id
    @SequenceGenerator(name="product_seq", sequenceName="product_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "product_seq")
    private Long id;
    private String name;
    private String description;
    private String brand;
    private Integer price;
    private String category;
    private LocalDate releaseDate;
    private boolean productAvailable;
    private Integer stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    @Column(name = "image_data",columnDefinition = "LONGBLOB")
    private byte[] imageData;


}
