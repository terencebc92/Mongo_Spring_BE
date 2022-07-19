package com.example.mdbspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tutorials")
public class Tutorial {

    @Id
    private String id;
    private String title;
    private String description;

    public Tutorial(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Tutorial(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Tutorial() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

