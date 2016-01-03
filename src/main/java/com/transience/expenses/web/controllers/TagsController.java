package com.transience.expenses.web.controllers;

import com.transience.expenses.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Created by sanju on 3/01/2016.
 */
@Controller
public class TagsController {

    @Autowired private TagService tagService;



    @RequestMapping("/tag/list")
    public String getAllTags(Model model) {
        model.addAttribute("greeting", "Currenttime is: " + LocalDateTime.now());
        model.addAttribute("allTags", tagService.getAllTags());

        return "all_tags";
    }

/*    @RequestMapping(method= RequestMethod.GET, value="/tag/api/list", produces="application/json")
    public @ResponseBody
    List<Tag> getAllTagsJson(Model model) {
        return tagService.getAllTags();
    }*/









    // ======= BORING STUFF FOLLOWS


    public TagsController() {
    }


    public TagsController(TagService tagService) {
        this.tagService = tagService;
    }
}
