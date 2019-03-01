package com.chinawyny.devops.autodeploy.core.dao;

import org.springframework.stereotype.Repository;

import com.chinawyny.devops.autodeploy.core.entity.Env;

@Repository
public interface EnvDao {

	int insertOne(Env env);
}
