package com.example.dslist.controllers;

import com.example.dslist.DTO.GameDTO;
import com.example.dslist.DTO.GameListDTO;
import com.example.dslist.DTO.GameMinDTO;
import com.example.dslist.entities.GameList;
import com.example.dslist.services.GameListService;
import com.example.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lista")
public class GameListController {

    @Autowired

    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }



}
