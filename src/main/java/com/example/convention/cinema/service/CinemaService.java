package com.example.convention.cinema.service;

import com.example.convention.cinema.repository.CinemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema service
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class CinemaService {

	private final CinemaRepository cinemaRepository;
}
