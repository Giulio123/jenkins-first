package com.sugfdo.jenkinsfirst;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
/*JenkinsFirst logic*/
@Service
public class JenkinsFirst {
	

	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
	
	@Cacheable("diff")
	public int diff(int a, int b) {
		return a - b;
	}
}
