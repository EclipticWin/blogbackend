package com.ew.blogbackend.domain;

import com.ew.blogbackend.domain.common.BaseTimeEntity;

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
@Table(name = "bl_comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "content", length = 3000)
    private String content;

    @Column(name = "nickname", length = 30)
    private String nickname;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "writer_ip", length = 100)
    private String writerIp;

    @Column(name = "user_agent", length = 300)
    private String userAgent;

    @Column(name = "is_secret", length = 1)
    private String isSecret = "N";

    @Column(name = "is_deleted", length = 1)
    private String isDeleted = "N";
}