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
 * @description seat
 **********************************************************************************************************************/
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	// 좌석 이름
	private String name;

	// 예약일
	private LocalDate date;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="movie_id", nullable=false)
	private Movie movie;
}
