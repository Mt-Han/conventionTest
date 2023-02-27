package com.example.convention.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @since       2023.02.27
 * @author      martin
 * @description movie
 **********************************************************************************************************************/
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	// 이름
	private String name;

	// 상영 시작일
	private LocalDate startDate;

	// 상영 종료일
	private LocalDate endDate;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cinema_id", nullable=false)
	private Cinema cinema;
}
