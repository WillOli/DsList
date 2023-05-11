package com.WillDev.DsList.services;

import com.WillDev.DsList.dto.GameDTO;
import com.WillDev.DsList.dto.GameMinDTO;
import com.WillDev.DsList.entities.Game;
import com.WillDev.DsList.repositories.GameRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service

public class GameService {

    @Autowired
    public GameRepository gameRepository;
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return new GameDTO(result);
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

}