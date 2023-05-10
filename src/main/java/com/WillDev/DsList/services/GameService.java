package com.WillDev.DsList.services;

import com.WillDev.DsList.dto.GameMinDTO;
import com.WillDev.DsList.entities.Game;
import com.WillDev.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

}