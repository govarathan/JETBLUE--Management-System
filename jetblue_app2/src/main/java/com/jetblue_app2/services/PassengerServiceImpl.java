package com.jetblue_app2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetblue_app2.entity.Passenger;
import com.jetblue_app2.respository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerRepository  passRepo;
	@Override
	public void savePassInfo(Passenger pass) {
		passRepo.save(pass);
	}
	@Override
	public List<Passenger> listallData(Passenger pass) {
		List<Passenger> passengers = passRepo.findAll();
		return passengers;
	}
	@Override
	public Passenger updateOnePass(long id) {
		Optional<Passenger> findById = passRepo.findById(id);
		Passenger passenger = findById.get();
		return  passenger;
	}
	@Override
	public void updateOneData(Passenger pass) {
	    passRepo.save(pass);
		
	}
	@Override
	public void deleteOnePass(long id) {
		passRepo.deleteById(id);
	}
	

}
