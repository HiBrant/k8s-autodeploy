package com.chinawyny.devops.autodeploy.core.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Env {

	private int id;
	private String name;
	private int kind;
	private String descr;
	private String owner;
	private int status;
	private Date ctime;
	private Date utime;
}
