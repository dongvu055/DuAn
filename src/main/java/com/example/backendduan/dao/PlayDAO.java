package com.example.backendduan.dao;

import lombok.Data;

import javax.persistence.*;
/*
    Lấy dữ liệu cho các câu hỏi thuộc loại trắc nghiệm
* */
@Entity
@Table(name = "play")
@Data
public class PlayDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_name")
    private String questionName;

    @Column(name = "question_type")
    private String questionType;

    @Column(name = "description")
    private String description;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "number_of_uses")
    private int numberOfUses;

}
