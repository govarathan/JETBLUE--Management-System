package com.jetblue_app2.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetblue_app2.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
