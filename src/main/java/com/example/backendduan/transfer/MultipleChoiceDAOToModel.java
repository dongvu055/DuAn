package com.example.backendduan.transfer;

import com.example.backendduan.dao.MultipleChoiceDAO;
import com.example.backendduan.model.MultipleChoiceModel;
import org.springframework.stereotype.Component;

@Component
public class MultipleChoiceDAOToModel{
    public MultipleChoiceModel transferToModel(MultipleChoiceDAO multipleChoiceDAO)
    {
        return MultipleChoiceModel.builder()
                .objectId(multipleChoiceDAO.getObjectid())
                .roomName(multipleChoiceDAO.getRoomName())
                .questionName(multipleChoiceDAO.getQuestionName())
                .answer1(multipleChoiceDAO.getAnswer1())
                .answer2(multipleChoiceDAO.getAnswer2())
                .answer3(multipleChoiceDAO.getAnswer3())
                .answer4(multipleChoiceDAO.getAnswer4())
                .correctAnswer(multipleChoiceDAO.getCorrectAnswer())
        .build();
    }
}
