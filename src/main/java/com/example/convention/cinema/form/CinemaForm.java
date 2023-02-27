package com.example.convention.cinema.form;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @since       2023.02.27
 * @author      martin
 * @description cinema form
 **********************************************************************************************************************/
public class CinemaForm {

	public static class Request {

		@Getter
		@Setter
		@Builder(toBuilder = true)
		@ToString
		@NoArgsConstructor
		@AllArgsConstructor
		public static class find {

			@Min(value=0)
			@NotNull
			private Long peopleCounts;

			@Valid
			private Movie movie;

			@Getter
			@Setter
			@Builder(toBuilder = true)
			@ToString
			@NoArgsConstructor
			@AllArgsConstructor
			public static class Movie {

				@NotNull
				private Long id;
			}

		}
	}

	public static class Response {

		@Data
		public static class FindAll {

			private Long id;

			private String name;
		}

	}
}
