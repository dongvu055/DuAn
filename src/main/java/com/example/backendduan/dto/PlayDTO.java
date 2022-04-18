package com.example.backendduan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
    Trả dữ liệu về cho các câu hỏi thuộc loại trắc nghiệm
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayDTO {

    private int id;

    private String questionName;

    private String questionType;

    private String description;

    private String correctAnswer;

    private int numberOfUses;
}
