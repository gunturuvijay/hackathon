package com.example.database1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.database1.model.MonthlySpendModel;
import com.example.database1.repository.MonthlySpendRepository;

@RestController
@EnableAutoConfiguration
@CrossOrigin
public class MonthlySpendController {

	@Autowired
	private MonthlySpendRepository repo;

	@GetMapping(value = "/getMonthlybyGroup")
	public ResponseEntity<List<MonthlySpendModel>> getMonthlyGroup() {
		List<MonthlySpendModel> mMonthlySpendModel = new ArrayList<>();
		try {
			mMonthlySpendModel = repo.getMonthlySpendGroup();
			return new ResponseEntity<>(mMonthlySpendModel, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(mMonthlySpendModel, HttpStatus.BAD_REQUEST);
		}

	}
}
