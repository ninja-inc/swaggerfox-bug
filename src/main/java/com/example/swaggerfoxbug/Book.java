package com.example.swaggerfoxbug;

import lombok.Data;

@Data
public class Book {
	private Desc desc;

	@Data
	public static class Desc {
		private String i_am_book_inner_class;
	}
}
