package com.example.repository;

import com.example.model.Todo;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TodoRepository implements PanacheRepositoryBase<Todo, Long> {
}
