package com.example.service;

import com.example.model.Todo;
import com.example.repository.TodoRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(Todo todo) {
        todoRepository.persist(todo);
        return todo;
    }

    public List<Todo> findAll() {
        return todoRepository.listAll();
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id);
    }

    public Todo update(Long id, Todo todo) {
        Todo entity = todoRepository.findById(id);
        entity.setTitle(todo.getTitle());
        entity.setDescription(todo.getDescription());
        entity.setDone(todo.isDone());
        return entity;
    }

    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
