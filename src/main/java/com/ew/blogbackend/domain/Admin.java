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
@Table(name = "bl_admin")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_name", length = 100)
    private String accountName;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "nickname", length = 60)
    private String nickname;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "email", length = 320)
    private String email;

    @Column(name = "image_link", length = 500)
    private String imageLink;
}