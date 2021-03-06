package com.hsl.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tittle;
    private String descriptionShort;
    private String description;
    private String author;
    private LocalDateTime datePost;

    public Blog() {
    }

    public Blog(Long id, String tittle, String descriptionShort, String description, String author, LocalDateTime datePost) {
        this.id = id;
        this.tittle = tittle;
        this.descriptionShort = descriptionShort;
        this.description = description;
        this.author = author;
        this.datePost = datePost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDatePost() {
        return datePost;
    }

    public void setDatePost(LocalDateTime datePost) {
        this.datePost = datePost;
    }
}
