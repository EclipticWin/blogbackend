package com.ew.blogbackend.domain;

import com.ew.blogbackend.domain.common.BaseCreatedTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bl_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseCreatedTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cate_name", length = 60)
    private String cateName;

    @Column(name = "parent_cate_id")
    private Long parentCateId;

    @Column(name = "is_deleted", length = 1)
    private String isDeleted = "N";
}