package com.example.backendduan.transfer;

import com.example.backendduan.dto.PlayDTO;
import com.example.backendduan.model.PlayModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayModelDTO {

    public PlayDTO transferToDTO(PlayModel playModel) {
        PlayDTO playDTO = new PlayDTO();
        playDTO.setId(playModel.getId());
        playDTO.setQuestionName(playModel.getQuestionName());
        playDTO.setQuestionType(playModel.getQuestionType());
        playDTO.setDescription(playModel.getDescription());
        playDTO.setCorrectAnswer(playModel.getCorrectAnswer());
        playDTO.setActive(playModel.isActive());
        return playDTO;
    }

    public List<PlayDTO> transferListDTO(List<PlayModel> playModels) {
        List<PlayDTO> playDTOS = new ArrayList<>();
        playModels.forEach(playModel -> {
            playDTOS.add(new PlayModelDTO().transferToDTO(playModel));
        });
        return playDTOS;

    }

    public PlayModel transferToModel(PlayDTO playDTO) {
        return PlayModel.builder()
                .id(playDTO.getId())
                .questionName(playDTO.getQuestionName())
                .questionType(playDTO.getQuestionType())
                .description(playDTO.getDescription())
                .correctAnswer(playDTO.getCorrectAnswer())
                .isActive(playDTO.isActive())
                .build();
    }

    public List<PlayModel> transferListModel(List<PlayDTO> playDTOS) {
        List<PlayModel> playModels = new ArrayList<>();
        playDTOS.forEach(playDTO -> {
            playModels.add(new PlayModelDTO().transferToModel(playDTO));
        });
        return playModels;

    }
}
