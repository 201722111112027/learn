package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.WangDao;
import edu.hubu.learn.entity.Wang;

@Service
public class WangService {

    @Autowired
    private WangDao wangDao;

    public Wang getWang(Long id) {
        return wangDao.findById(id).get();
    }
    public List<Wang> getFiles() {
        return wangDao.findAll(new Sort(Direction.DESC, "id"));
    
    }

    public List<Wang> searchWang(String keyword) {
        Wang wang = new Wang();
        wang.setUsername(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("username", match->match.contains());
        Example<Wang> example = Example.of(wang, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return wangDao.findAll(example, sort);
    }

    public Wang addWang(Wang wang) {
        return wangDao.save(wang);
    }

    public void deleteUser(Long id) {
       wangDao.deleteById(id);
    }

    public void modifyWang(Wang wang) {
        wangDao.save(wang);
    }
}