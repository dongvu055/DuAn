package com.example.backendduan.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayModel {

    private int id;

    private String questionName;

    private String questionType;

    private String description;

    private String correctAnswer;

    private boolean isActive;

}
