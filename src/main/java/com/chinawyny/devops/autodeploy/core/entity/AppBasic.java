package com.chinawyny.devops.autodeploy.core.entity;

import java.util.Date;

import lombok.Data;

@Data
public class AppBasic {

	private int id;
	private int envId;
	private String name;
	private String descr;
	private int weight;
	private int kind;
	private int status;
	private Date deployTime;
	private Date ctime;
	private Date utime;
}
