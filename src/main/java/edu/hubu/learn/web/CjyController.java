package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.hubu.learn.service.CjyService;

@RestController
@RequestMapping("/cjy")
public class CjyRestController {

    @Autowired
    private CjyService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object getAll() {
        return service.getCjys();
    }
}