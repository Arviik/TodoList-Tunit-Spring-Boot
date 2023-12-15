package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoListController {
    private final ToDoListRepository repository;

    public ToDoListController(ToDoListRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/users/{id}/todos")
    ToDoList newToDoList(@RequestBody ToDoList newToDo){
        return repository.save(newToDo);
    }

    @GetMapping("/users/{id}/todos/items")
    ToDoList getToDoList(@PathVariable Long id){
        return repository.getReferenceById(id);
    }
}
