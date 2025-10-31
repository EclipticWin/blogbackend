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
@Table(name = "bl_article_file")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ArticleFile extends BaseCreatedTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "file_location", length = 500)
    private String fileLocation;

    @Column(name = "file_original_name", length = 3000)
    private String fileOriginalName;

    @Column(name = "is_deleted", length = 1)
    private String isDeleted = "N";
}