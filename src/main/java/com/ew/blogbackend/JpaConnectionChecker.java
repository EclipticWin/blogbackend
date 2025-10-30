package com.ew.blogbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ew.blogbackend.domain.TestEntity;
import com.ew.blogbackend.repository.TestRepository;

@Component
public class JpaConnectionChecker implements CommandLineRunner {

    private final TestRepository testRepository;

    public JpaConnectionChecker(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public void run(String... args) {
        TestEntity entity = new TestEntity("연결 테스트");
        testRepository.save(entity);
        System.out.println("JPA 연결 테스트 성공 : " + entity);
    }

}
