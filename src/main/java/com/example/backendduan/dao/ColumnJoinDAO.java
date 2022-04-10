package com.example.backendduan.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
    Lấy dữ liệu cho các câu hỏi thuộc loại nối
* */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ColumnJoinDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String objectid;
}
