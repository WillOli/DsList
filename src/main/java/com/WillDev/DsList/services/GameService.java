package com.WillDev.DsList.services;

import com.WillDev.DsList.dto.GameDTO;
import com.WillDev.DsList.dto.GameMinDTO;
import com.WillDev.DsList.entities.Game;
import com.WillDev.DsList.projection.GameMinProjection;
import com.WillDev.DsList.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service

public class GameService {

    @Autowired
    public GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDTO::new).toList();
    }

}