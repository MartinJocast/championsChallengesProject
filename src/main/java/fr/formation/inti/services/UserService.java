package fr.formation.inti.services;

import java.util.List;

import fr.formation.inti.entities.Users;

public interface UserService {

	public List<Users> findAll();
	
	public Users findById(Integer idUser);
	
	public Users findByEmail(String email);
}
