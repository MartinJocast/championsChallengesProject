package fr.formation.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

	Users findByEmail(String email);  

	
}
