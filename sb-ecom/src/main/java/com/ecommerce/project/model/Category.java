package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="categories") //maps the entity category as a table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id //marks categoryId as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //concurrent transactions handled
    private Long categoryId;
    private String categoryName;

//    public Category(Long categoryId, String categoryName) {
//        this.categoryId= categoryId;
//        this.categoryName = categoryName;
//    }
//
//    public Category() { //default constructor, considered as a good practice to define it
//    }
//
//    public Long getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Long categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }

}
