package com.transience.expenses.services;

import com.transience.expenses.domain.Tag;
import com.transience.expenses.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sanju on 3/01/2016.
 */
@Service
public class TagService {

    @Autowired
    TagRepository tagRepository;


    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    public TagService() {
    }

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }
}
