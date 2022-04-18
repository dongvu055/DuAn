package com.example.backendduan.controller;

import com.example.backendduan.dto.PlayDTO;
import com.example.backendduan.model.PlayModel;
import com.example.backendduan.service.DuAnService;
import com.example.backendduan.transfer.PlayModelDTO;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuAnAPI {
    @Autowired
    private DuAnService duAnService;

    @GetMapping("/play")
    public ResponseEntity<List<PlayDTO>> getAll() {
        List<PlayDTO> playDTOS = new PlayModelDTO().transferListDTO(duAnService.getall());
        return new ResponseEntity<>(playDTOS, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody(required = true) PlayDTO playDTO) {
        if (ObjectUtils.isEmpty(playDTO.getQuestionName()))
            return new ResponseEntity<>("REQUIRED BODY", HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(duAnService.save(playDTO), HttpStatus.OK);
    }

    @PostMapping("/modifierActive")
    public ResponseEntity<List<PlayDTO>> modifierActive(@RequestBody(required = true) List<Integer> listId) {
        List<PlayModel> playModels = duAnService.modifierActive(listId);
        List<PlayDTO> playDTOS = new PlayModelDTO().transferListDTO(playModels);
        return new ResponseEntity<>(playDTOS, HttpStatus.OK);
    }
}
