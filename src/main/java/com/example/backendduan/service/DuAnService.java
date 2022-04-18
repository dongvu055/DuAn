package com.example.backendduan.service;

import com.example.backendduan.dao.PlayDAO;
import com.example.backendduan.dto.PlayDTO;
import com.example.backendduan.model.PlayModel;
import com.example.backendduan.repository.PlayRepository;
import com.example.backendduan.transfer.PlayDAOModel;
import com.example.backendduan.transfer.PlayModelDTO;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuAnService {
    @Autowired
    private PlayRepository playRepository;

    public List<PlayModel> getall() {
        List<PlayModel> playModels = new PlayDAOModel().transfertoListModel(playRepository.findAll());
        return playModels;
    }

    public String save(PlayDTO playDTO) {
        PlayModel playModel = new PlayModelDTO().transferToModel(playDTO);
        PlayDAO playDAO = new PlayDAOModel().transferToDAO(playModel);
        PlayDAO save = playRepository.save(playDAO);
        if (ObjectUtils.isEmpty(save))
            return "SAVE NOT SUCCESS";
        else
            return "SAVE SUCCESFULLY : " + save;
    }
}
