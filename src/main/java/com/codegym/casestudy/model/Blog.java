package com.codegym.casestudy.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String title;

    private String category;

    private String tags;

    private String image;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    private Date date;

    private String author;

    private String status;

    public Blog() {
    }

    public Blog(Long id, String title, String image, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public Blog(Long id, String title, String category, String tags, String image,
                String content, Date date, String author, String status) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.tags = tags;
        this.image = image;
        this.content = content;
        this.date = date;
        this.author = author;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
