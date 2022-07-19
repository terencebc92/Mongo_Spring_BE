package com.example.mdbspringboot.repository;

import com.example.mdbspringboot.model.Tutorial;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {

    List<Tutorial> findByTitleContaining(String title);


    /*

    Now we can use MongoRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… without implementing these methods.

    We also define custom finder methods:
    – findByTitleContaining(): returns all Tutorials which title contains input title.
    – findByPublished(): returns all Tutorials with published having value as input published.

     */
}
