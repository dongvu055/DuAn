package com.example.backendduan.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
    Lấy dữ liệu cho các câu hỏi thuộc loại trắc nghiệm
* */
@Entity
@Table(name = "multiplechoice")
@Data
public class MultipleChoiceDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String objectid;

    @Column(name = "room_name")
    private String  roomName;

    @Column(name = "question_name")
    private String  questionName;

    @Column(name = "answer1")
    private String  answer1;

    @Column(name = "answer2")
    private String  answer2;

    @Column(name = "answer3")
    private String  answer3;

    @Column(name = "answer4")
    private String  answer4;

    @Column(name = "correct_answer")
    private String  correctAnswer;

}
