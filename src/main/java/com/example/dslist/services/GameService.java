package com.example.dslist.services;

import com.example.dslist.DTO.GameDTO;
import com.example.dslist.DTO.GameMinDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional()
    public List<GameMinDTO> findAll(){

        List<Game> result =  gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }

    @Transactional()
    public GameDTO findById(Long id){
        Game  result =    gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }
}
