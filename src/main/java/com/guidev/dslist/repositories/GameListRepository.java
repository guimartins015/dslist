package com.guidev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guidev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
