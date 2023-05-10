package com.devSup.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSup.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
