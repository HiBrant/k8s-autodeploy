package com.chinawyny.devops.autodeploy.core.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BuildLog {

	private int id;
	private int appId;
	private String logPath;
	private Date ctime;
	private Date utime;
}
