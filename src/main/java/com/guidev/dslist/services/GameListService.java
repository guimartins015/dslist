package com.guidev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guidev.dslist.dto.GameDTO;
import com.guidev.dslist.dto.GameListDTO;
import com.guidev.dslist.dto.GameMinDTO;
import com.guidev.dslist.entities.Game;
import com.guidev.dslist.entities.GameList;
import com.guidev.dslist.repositories.GameListRepository;
import com.guidev.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository; 
	
	@Transactional(readOnly = true) // PARA SEGUIR AS REGRAS DO DB ACID
	public List<GameListDTO> findAll(){
		
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
}
