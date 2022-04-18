package com.example.backendduan.transfer;

import com.example.backendduan.dao.PlayDAO;
import com.example.backendduan.model.PlayModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayDAOModel {

    public PlayModel transferToModel(PlayDAO playDAO) {
        return PlayModel.builder()
                .id(playDAO.getId())
                .questionName(playDAO.getQuestionName())
                .questionType(playDAO.getQuestionType())
                .description(playDAO.getDescription())
                .correctAnswer(playDAO.getCorrectAnswer())
                .isActive(playDAO.isActive())
                .build();
    }

    public List<PlayModel> transfertoListModel(List<PlayDAO> playDAOS) {
        List<PlayModel> playModels = new ArrayList<>();
        playDAOS.forEach(playDAO -> {
            playModels.add(new PlayDAOModel().transferToModel(playDAO));
        });
        return playModels;

    }

    public PlayDAO transferToDAO(PlayModel playModel) {
        PlayDAO playDAO = new PlayDAO();
        playDAO.setId(playModel.getId());
        playDAO.setQuestionName(playModel.getQuestionName());
        playDAO.setQuestionType(playModel.getQuestionType());
        playDAO.setDescription(playModel.getDescription());
        playDAO.setCorrectAnswer(playModel.getCorrectAnswer());
        playDAO.setActive(playModel.isActive());
        return playDAO;
    }

    public List<PlayDAO> transfertoListDAO(List<PlayModel> playModels) {
        List<PlayDAO> playDAOS = new ArrayList<>();
        playModels.forEach(playModel -> {
            playDAOS.add(new PlayDAOModel().transferToDAO(playModel));
        });
        return playDAOS;

    }
}
