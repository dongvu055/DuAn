package com.example.backendduan.repository;

import com.example.backendduan.dao.AuthenDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenRepository extends JpaRepository<AuthenDAO, String> {
}
