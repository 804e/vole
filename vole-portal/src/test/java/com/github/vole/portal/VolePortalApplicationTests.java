package com.github.vole.portal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VolePortalApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("admin"));
	}

}
