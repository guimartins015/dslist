package com.guidev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guidev.dslist.dto.GameDTO;
import com.guidev.dslist.dto.GameMinDTO;
import com.guidev.dslist.entities.Game;
import com.guidev.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository; 
	
	@Transactional(readOnly = true) // PARA SEGUIR AS REGRAS DO DB ACID
	public GameDTO findByID(Long id) {
		Game result = gameRepository.findById(id).get(); //RETORNA UM OPTIONAL
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true) // PARA SEGUIR AS REGRAS DO DB ACID
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
}
