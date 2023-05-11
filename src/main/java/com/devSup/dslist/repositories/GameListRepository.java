package com.devSup.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSup.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
