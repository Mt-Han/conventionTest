package com.example.convention.cinema.repository;

import com.example.convention.cinema.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @since       2023.02.27
 * @author      martin
 * @description movie repository
 **********************************************************************************************************************/
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
