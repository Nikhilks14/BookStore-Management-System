package com.example.bookstore.Model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


public class BaseModel {

    @CreationTimestamp
    private Data cretedAt;

    @UpdateTimestamp
    private Data updatedAt;
}
