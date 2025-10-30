package com.ew.blogbackend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    protected TestEntity() {
    }

    public TestEntity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestEntity{id=" + id + ", name='" + name + "'}";
    }
}
