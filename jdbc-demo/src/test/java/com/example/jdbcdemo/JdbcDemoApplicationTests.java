package com.example.jdbcdemo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JdbcDemoApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void contextLoads() throws SQLException {
		String sql = "select * from user where name = '1' ";
		jdbcTemplate.queryForList(sql);

	}

}
