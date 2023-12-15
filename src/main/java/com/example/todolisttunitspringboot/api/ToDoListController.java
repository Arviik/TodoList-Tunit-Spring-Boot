package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.web.bind.annotation.*;

@RestController
public class ToDoListController {
    private final ToDoListRepository toDoRepository;
    private final ItemRepository itemRepository;

    public ToDoListController(ToDoListRepository repository, ItemRepository itemRepository) {
        this.toDoRepository = repository;
        this.itemRepository = itemRepository;
    }

    @PostMapping("/users/{id}/todos")
    ToDoList newToDoList(@RequestBody ToDoList newToDo){
        return toDoRepository.save(newToDo);
    }

    @GetMapping("/users/{id}/todos/items")
    public String getToDoList(@PathVariable Long id){
        System.out.println(id);
        System.out.println(itemRepository.getReferenceById(id).getTodolist_id());
        itemRepository.findToDoListId(id);
        return itemRepository.findById(id).get().toString();
    }
}
