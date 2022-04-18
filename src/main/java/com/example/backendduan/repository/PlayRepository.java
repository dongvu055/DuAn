package com.example.backendduan.repository;

import com.example.backendduan.dao.PlayDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayRepository extends JpaRepository<PlayDAO,Integer> {
}
