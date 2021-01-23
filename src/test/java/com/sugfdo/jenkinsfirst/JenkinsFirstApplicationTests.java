package com.sugfdo.jenkinsfirst;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsFirstApplicationTests {
	private JenkinsFirst jenkinsFirst = new JenkinsFirst();
	@Test
	public void testSum() {
		assertEquals(5, jenkinsFirst.sum(2, 3));
	}

}
