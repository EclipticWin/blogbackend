package com.ew.blogbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ew.blogbackend.domain.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
