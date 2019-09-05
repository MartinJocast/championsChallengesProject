package fr.formation.inti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.dao.UserDao;
import fr.formation.inti.entities.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public List<Users> findAll() {
		return dao.findAll();
	}
	
	@Override
	public Users findById(Integer idUser) {
		return dao.findById(idUser).get();
	}
	
	@Override
	public Users findByEmail(String email) {
		return dao.findByEmail(email);
	}

}
