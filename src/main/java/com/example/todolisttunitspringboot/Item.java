package com.example.todolisttunitspringboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Item {
    private String name;
    private String content;
    private LocalDate creationDate;
    @Id
    private Long id;

    public Item() {}

    public Item(String name, String content) {
        this.name = name;
        this.content = content;
        this.creationDate = LocalDate.now();
    }




    public boolean checkContent() {
        if (this.content == null || this.content.isEmpty()) {
            throw new IllegalArgumentException("Content isn't valid.");
        }
        if (this.content.length() > 1000) {
            throw new IllegalArgumentException("Content length's is over 1000.");
        }
        return true;
    }

    public void setContent(String content) {
        checkContent();
        this.content = content;
    }

}
