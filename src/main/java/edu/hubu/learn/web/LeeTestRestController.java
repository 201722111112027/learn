package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.hubu.learn.service.LeeTestService;



@RestController
@RequestMapping("/leetest")
public class LeeTestRestController {

    @Autowired
    private LeeTestService service;

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public Object getAll() {
        return service.getLeeTests();
    }
}