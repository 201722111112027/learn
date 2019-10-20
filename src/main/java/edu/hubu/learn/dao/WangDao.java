package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Wang;

public interface WangDao extends JpaRepository<Wang, Long> {

}