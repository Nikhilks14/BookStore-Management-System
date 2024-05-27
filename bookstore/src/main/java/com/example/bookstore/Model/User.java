package com.example.bookstore.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank
    private String name;

    @NotBlank(message = "Enter username")
    @Column(name = "username")
    private String username;

    private String password;

    @Email(message = " Enter Valid Email")
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> address;

    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(
            name = "User_Orders_Details" ,
            joinColumns = {
                    @JoinColumn(name = "User_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "Orders_Id" , referencedColumnName = "id")
            }
    )
    private Set<Orders> orders;
}
