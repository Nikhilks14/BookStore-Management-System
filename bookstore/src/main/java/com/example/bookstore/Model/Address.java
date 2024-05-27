package com.example.bookstore.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private int Address_Id;
    private String Address;
    @NotBlank
    private String pincode;
    @ManyToOne()
    private User user;

    @OneToMany(mappedBy = "address" , cascade = CascadeType.ALL)
    private List<Orders> orders;
}
