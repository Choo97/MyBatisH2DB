package com.study.springBoot;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.springBoot.jdbc.Board;
import com.study.springBoot.jdbc.BoardMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class MyBatis0213ApplicationTests {

	@Autowired
	BoardMapper boardMapper;
	
	@Test
	
	void contextLoads() {
		log.info("--테스트");
	}
	
	@Test
	@DisplayName("findAll test")
	void testFindAll() {
		List<Board> blst = boardMapper.findAll();
		log.info(blst);
	}

}
