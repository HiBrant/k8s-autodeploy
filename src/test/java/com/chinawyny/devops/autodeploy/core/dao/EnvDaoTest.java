package com.chinawyny.devops.autodeploy.core.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinawyny.devops.autodeploy.SpringBootTestBase;
import com.chinawyny.devops.autodeploy.core.entity.Env;

public class EnvDaoTest extends SpringBootTestBase {

	@Autowired
	private EnvDao envDao;
	
	@Test
	public void test() {
		Env env = new Env();
		env.setName("test" + System.currentTimeMillis());
		env.setKind(0);
		env.setDescr("test123");
		env.setOwner("liujian");
		System.err.println(envDao.insertOne(env));
		System.err.println("id: " + env.getId());
	}
}
