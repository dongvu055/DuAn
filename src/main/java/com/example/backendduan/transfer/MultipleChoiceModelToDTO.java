package com.example.backendduan.transfer;

import com.example.backendduan.dto.MultipleChoiceDTO;
import com.example.backendduan.model.MultipleChoiceModel;
import org.springframework.stereotype.Component;

@Component
public class MultipleChoiceModelToDTO {
    public MultipleChoiceDTO transferToDTO(MultipleChoiceModel multipleChoiceModel)
    {
        MultipleChoiceDTO multipleChoiceDTO = new MultipleChoiceDTO();
        multipleChoiceDTO.setObjectId(multipleChoiceModel.getObjectId());
        multipleChoiceDTO.setRoomName(multipleChoiceModel.getRoomName());
        multipleChoiceDTO.setQuestionName(multipleChoiceModel.getQuestionName());
        multipleChoiceDTO.setAnswer1(multipleChoiceModel.getAnswer1());
        multipleChoiceDTO.setAnswer2(multipleChoiceModel.getAnswer2());
        multipleChoiceDTO.setAnswer3(multipleChoiceModel.getAnswer3());
        multipleChoiceDTO.setAnswer4(multipleChoiceModel.getAnswer4());
        multipleChoiceDTO.setCorrectAnswer(multipleChoiceModel.getCorrectAnswer());
        return multipleChoiceDTO;
    }
}
