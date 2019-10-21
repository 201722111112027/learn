package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.LeeTestDao;
import edu.hubu.learn.entity.LeeTest;

@Service
public class LeeTestService {

    @Autowired
    private LeeTestDao dao;

    public LeeTest getlLeeTest(Long id) {
        return dao.findById(id).get();
    }

    public List<LeeTest> getLeeTests() {
        return dao.findAll(new Sort(Direction.DESC, "id"));
    }
    
}
