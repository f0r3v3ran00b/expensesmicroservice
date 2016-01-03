package com.transience.expenses.web.controllers;

import com.transience.expenses.domain.Tag;
import com.transience.expenses.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sanju on 3/01/2016.
 */
@RestController
public class TagsControllerRest {

    @Autowired
    private TagRepository tagRepository;

    @RequestMapping(value = "/tag/api/list", method= RequestMethod.GET)
    public List<Tag> findAllTags() {
        return tagRepository.findAll();
    }



    // ----------- BORING STUFF

    public TagRepository getTagRepository() {
        return tagRepository;
    }

    public TagsControllerRest setTagRepository(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
        return this;
    }
}
