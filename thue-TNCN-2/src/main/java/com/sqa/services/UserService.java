package com.sqa.services;

import java.util.List;

import com.sqa.models.dtos.NguoinopthueDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


import com.sqa.models.entities.Nguoinopthue;
import com.sqa.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class UserService {

	@Autowired 
	private UserRepository repository;
	@Autowired
	private ModelMapper mapper;
	
	public List<Nguoinopthue> listAllUser() {
		return repository.findAll();
	}
	
	public void save(Nguoinopthue user) {
		repository.save(user);
	}
	
	public Nguoinopthue get(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	public boolean checkLogin(Nguoinopthue user) {
		List<Nguoinopthue> list=repository.findAll();
		for(Nguoinopthue i:list) {
			if(i.getUsername().compareTo(user.getUsername())==0 && i.getPassword().compareTo(user.getPassword())==0) {
				user.setId(i.getId());
				return true;
			}
		}
		return false;
	}

	public NguoinopthueDTO convertToDto(Nguoinopthue person) {
		NguoinopthueDTO nntDTO = mapper.map(person, NguoinopthueDTO.class);
		return nntDTO;
	}
	public Nguoinopthue convertToEntity(NguoinopthueDTO personDto) {
		Nguoinopthue nnt = mapper.map(personDto, Nguoinopthue.class);
		return nnt;
	}
	public Nguoinopthue getByMasothue(String masothue) {
		return repository.getByMaSoThue(masothue);
	}
}
