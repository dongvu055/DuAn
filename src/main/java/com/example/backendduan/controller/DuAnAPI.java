package com.example.backendduan.controller;

import com.example.backendduan.dao.MultipleChoiceDAO;
import com.example.backendduan.dto.MultipleChoiceDTO;
import com.example.backendduan.service.DuAnService;
import com.example.backendduan.transfer.MultipleChoiceModelToDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/play/")
public class DuAnAPI {
    @Autowired
    private DuAnService duAnService;

    @Autowired
    private MultipleChoiceModelToDTO multipleChoiceModelToDTO;

    @GetMapping("multiple_choice/{object_id}")
    public ResponseEntity<MultipleChoiceDTO> getMultipleChoice(@PathVariable(name = "object_id") String objectId)
    {
        return new ResponseEntity<MultipleChoiceDTO>(multipleChoiceModelToDTO.transferToDTO(duAnService.getMultipleChoiceByObjectID(objectId)), HttpStatus.OK);
    }
    @GetMapping("column_join/{object_id}")
    public void getColumnJoin()
    {

    }
}
