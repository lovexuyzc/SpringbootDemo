package com.boot.springbootdemo.repository;


import com.boot.springbootdemo.Entity.Entitys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<Entitys, String> {

}
