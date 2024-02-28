package com.project.pharmacine.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductModel {
    @Id
    private int id;
    private String name;
    private String description;
    private float price;
    private int quantity;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
    List<BillDetail>billDetails;
}
