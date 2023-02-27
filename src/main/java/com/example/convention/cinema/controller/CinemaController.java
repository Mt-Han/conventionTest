package com.example.convention.cinema.controller;

import com.example.convention.cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema service
 **********************************************************************************************************************/
@RestController("/api")
@RequiredArgsConstructor
public class CinemaController {

	private final CinemaService cinemaService;

	@GetMapping("/cinema")
	public void getByMovie() {

	}
}
