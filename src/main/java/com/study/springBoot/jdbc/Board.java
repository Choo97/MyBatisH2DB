package com.study.springBoot.jdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
	private int num;
	private String writer;
	private String title;
	private String content;
}
