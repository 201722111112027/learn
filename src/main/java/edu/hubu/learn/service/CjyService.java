package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.CjyDao;
import edu.hubu.learn.entity.Cjy;

@Service
public class CjyService {

    @Autowired
    private CjyDao dao;

    public Cjy getCjy(Long id) {
        return dao.findById(id).get();
    }

    public List<Cjy> getCjys() {
        return dao.findAll(new Sort(Direction.DESC, "id"));
    }
    
}