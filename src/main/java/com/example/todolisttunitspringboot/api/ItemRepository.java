package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<ToDoList> findToDoListId(Long id);
}
