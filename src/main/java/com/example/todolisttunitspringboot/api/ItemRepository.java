package com.example.todolisttunitspringboot.api;

import com.example.todolisttunitspringboot.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
