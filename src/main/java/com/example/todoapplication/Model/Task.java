package com.example.todoapplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String title;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   private boolean completed;

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return title;
   }

   public boolean isCompleted() {
      return completed;
   }

   public void setCompleted(boolean completed) {
      this.completed = completed;
   }
}
