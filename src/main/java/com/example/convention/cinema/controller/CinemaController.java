package com.example.convention.cinema.controller;

import com.example.convention.cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema controller
 **********************************************************************************************************************/
@RestController
@RequestMapping("/cinema")
@RequiredArgsConstructor
public class CinemaController {

	private final CinemaService cinemaService;

	@GetMapping
	public void getByMovie() {

	}
}
