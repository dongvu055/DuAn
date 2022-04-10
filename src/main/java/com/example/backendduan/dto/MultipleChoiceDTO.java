package com.example.backendduan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    Trả dữ liệu về cho các câu hỏi thuộc loại trắc nghiệm
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleChoiceDTO {
    private String objectId;
    private String roomName;
    private String questionName;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
}
