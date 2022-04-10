package com.example.backendduan.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MultipleChoiceModel {
    private String objectId;
    private String roomName;
    private String questionName;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
}
