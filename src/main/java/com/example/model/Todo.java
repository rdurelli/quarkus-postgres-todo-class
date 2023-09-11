package com.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Todo extends PanacheEntity {

    private String title;

    private String description;

    private boolean done;


}
