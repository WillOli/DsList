package com.WillDev.DsList.controllers;

import java.util.List;

import com.WillDev.DsList.dto.GameMinDTO;
import com.WillDev.DsList.dto.ReplacementeDTO;
import com.WillDev.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.WillDev.DsList.dto.GameListDTO;
import com.WillDev.DsList.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGameList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementeDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }
}
