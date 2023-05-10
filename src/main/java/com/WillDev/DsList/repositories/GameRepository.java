package com.WillDev.DsList.repositories;

import com.WillDev.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {


}
