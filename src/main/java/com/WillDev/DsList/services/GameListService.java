package com.WillDev.DsList.services;

import com.WillDev.DsList.dto.GameListDTO;
import com.WillDev.DsList.entities.GameList;
import com.WillDev.DsList.repositories.GameListRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class GameListService {

    @Autowired
    public GameListRepositoty gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}