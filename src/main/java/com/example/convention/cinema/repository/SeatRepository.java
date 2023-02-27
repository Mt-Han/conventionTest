package com.example.convention.cinema.repository;

import com.example.convention.cinema.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @since       2023.02.27
 * @author      martin
 * @description seat repository
 **********************************************************************************************************************/
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
