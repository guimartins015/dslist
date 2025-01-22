package com.guidev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guidev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
