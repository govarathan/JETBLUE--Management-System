package com.jetblue_app2.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jetblue_app2.entity.Passenger;
import com.jetblue_app2.respository.PassengerRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private PassengerRepository passRepo;
	
	//http://localhost:8080/api/listallapi
	@GetMapping("/listallapi")
	public List<Passenger> listallapi(){
		List<Passenger>pass=passRepo.findAll();
		return pass;
	}
	//http://localhost:8080/api/saveapi
	@PostMapping("/saveapi")
	public void saveapi(@RequestBody Passenger pass ) {
		passRepo.save(pass);
	}
	//http://localhost:8080/api/updateapi
	@PutMapping("/updateapi")
	public void updateapi(@RequestBody Passenger pass) {
		passRepo.save(pass);
	}
	//http://localhost:8080/api/deleteapi/2
	@DeleteMapping("/deleteapi")
	public void deleteapi(@PathVariable("id")long id) {
		passRepo.deleteById(id);
	}
	
	

}
