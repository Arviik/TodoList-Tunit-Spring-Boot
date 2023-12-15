package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {
}
