package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {
}
