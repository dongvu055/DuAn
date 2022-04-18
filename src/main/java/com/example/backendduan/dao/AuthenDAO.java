package com.example.backendduan.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@Data
public class AuthenDAO {

    @Id
    private String username;

    @Column(name = "password")
    private String password;

}
