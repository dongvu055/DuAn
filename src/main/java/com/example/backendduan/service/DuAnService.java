package com.example.backendduan.service;

import com.example.backendduan.model.MultipleChoiceModel;
import com.example.backendduan.repository.MultipleChoiceRepository;
import com.example.backendduan.transfer.MultipleChoiceDAOToModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuAnService {
    @Autowired
    private MultipleChoiceRepository multipleChoiceRepository;

    @Autowired
    private MultipleChoiceDAOToModel multipleChoiceDAOToModel;

    public MultipleChoiceModel getMultipleChoiceByObjectID(String objectId)
    {
        return multipleChoiceDAOToModel.transferToModel(multipleChoiceRepository.findByObjectid(objectId));
    }

}
