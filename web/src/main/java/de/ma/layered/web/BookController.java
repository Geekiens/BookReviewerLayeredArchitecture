package de.ma.layered.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class BookController {


    @RequestMapping(value = "/book", method = GET)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Test:" + name;
    }
}
