package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {
    private final ToDoListRepository repository;

    public ToDoListController(ToDoListRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    ToDoList newToDoList(@RequestBody ToDoList newToDo){
        return repository.save(newToDo);
    }
}
