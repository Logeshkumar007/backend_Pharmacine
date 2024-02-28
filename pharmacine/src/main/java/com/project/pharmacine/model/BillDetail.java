package com.project.pharmacine.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BillDetail {
    @Id
    private int id;

    @JsonBackReference(value = "product-billDetail")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProductModel product;
    
    @JsonBackReference(value = "customerInfo-billDetail")
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerInfo customerInfo;
}
