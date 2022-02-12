package codebyspring.config;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import codebyspring.AppMainTest;

public class RootConfigTest extends AppMainTest{
	
	@Autowired
	private DataSource dataSource;

	// DataSource 연결 확인 테스트
	@Test
	public void dataSourceTest() {
		assertNotNull(dataSource);
	}

}
