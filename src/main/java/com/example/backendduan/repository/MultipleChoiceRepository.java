package com.example.backendduan.repository;

import com.example.backendduan.dao.MultipleChoiceDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MultipleChoiceRepository extends JpaRepository<MultipleChoiceDAO, String> {
    public MultipleChoiceDAO findByObjectid(String objectid);
}
