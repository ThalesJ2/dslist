package com.example.dslist.services;

import com.example.dslist.DTO.GameDTO;
import com.example.dslist.DTO.GameListDTO;
import com.example.dslist.DTO.GameMinDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.entities.GameList;
import com.example.dslist.repositories.GameListRepository;
import com.example.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional()
    public List<GameListDTO> findAll(){

        List<GameList> result =  gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;

    }


}
