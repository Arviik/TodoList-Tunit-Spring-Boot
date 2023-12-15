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

    @PostMapping("/users/{id}/todos/items")
    Item newItem(@RequestBody Item newItem){
        return repository.save(newItem);
    }


}
