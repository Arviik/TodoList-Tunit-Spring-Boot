package com.example.todolisttunitspringboot;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@Setter
@Entity
public class ToDoList {
    static EmailSenderService emailSenderService;
    private int user_id;
    @Id
    private Long id;

    public ToDoList() {}

    /*public ToDoList(User user) throws InstantiationException {
        if (user.isValid()) {
            itemList = new ArrayList<>();
        } else {
            throw new InstantiationException("User not valid");
        }
    }

    public void addItem(Item item, User user) {
        try {
            if (itemList.size() <= 10 && user.isValid() && ChronoUnit.MINUTES.between(item.getCreationDate(), itemList.getLast().getCreationDate()) > 30 && itemList.stream().noneMatch(p -> p.getName().equals(item.getName()))) {
                itemList.add(item);
                if (itemList.size() == 8) {
                    emailSenderService.sendEmail(user.getEmail());
                }
                save();
            } else {
                throw new IllegalArgumentException("Error in item");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }*/

    @Override
    public String toString() {
        return user_id + " ";
    }

    public boolean save() {
        //sauvegarde en bdd
        return false;
    }
}
