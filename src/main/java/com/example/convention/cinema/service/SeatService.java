package com.example.convention.cinema.service;

import com.example.convention.cinema.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @since       2023.02.27
 * @author      martin
 * @description seat service
 **********************************************************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor
public class SeatService {

	private final SeatRepository seatRepository;
}
