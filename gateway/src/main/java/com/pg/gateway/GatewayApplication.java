package com.pg.gateway;

import com.pg.gateway.modals.TrackModal.*;
import com.pg.gateway.modals.TrackModal.Kinematics.TrackKinematicsModal;
import com.pg.gateway.services.TrackModalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GatewayApplication implements CommandLineRunner {

	@Autowired
	private TrackModalService trackModalService;


	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		// THIS CODE BLOCK IS FOR TESTING AND GOING TO BE REMOVED
		TrackModal t = new TrackModal();
		t.setKinematics(new TrackKinematicsModal());
		t.setTrackId((long) 0);
		t.getKinematics().setLongitude(200);
		trackModalService.setTrack(t); 
		Thread.currentThread().join(); 
		////////

	}

}
