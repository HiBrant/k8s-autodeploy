package com.chinawyny.devops.autodeploy.core.entity;

import java.util.Date;

import lombok.Data;

@Data
public class AppConfig {

	private int id;
	private int appId;
	private int kind;
	private String configKey;
	private String configValue;
	private Date ctime;
	private Date utime;
}
