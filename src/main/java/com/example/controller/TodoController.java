package com.example.controller;

import com.example.model.Todo;
import com.example.service.TodoService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

import java.util.List;

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@AllArgsConstructor
public class TodoController {

    private final TodoService todoService;


    @POST
    @Transactional
    public Todo add(Todo todo) {
        return todoService.create(todo);
    }

    @GET
    public List<Todo> findAll() {
        return todoService.findAll();
    }
}
