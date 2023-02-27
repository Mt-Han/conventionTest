package com.example.convention.cinema.repository;

import com.example.convention.cinema.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema repository
 **********************************************************************************************************************/
@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>, QuerydslPredicateExecutor<Cinema>, CinemaRepositorySupport {

}
