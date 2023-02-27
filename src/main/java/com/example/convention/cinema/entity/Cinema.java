package com.example.convention.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema
 **********************************************************************************************************************/
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	// 이름
	private String name;
}
