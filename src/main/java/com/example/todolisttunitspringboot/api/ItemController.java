package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
    private final ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    Item newToDoList(@RequestBody Item newItem){
        return repository.save(newItem);
    }

    @GetMapping
    Item getToDoItems(@PathVariable Long id){
        return repository.getReferenceById(id);
    }
}