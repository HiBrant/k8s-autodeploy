package com.chinawyny.devops.autodeploy.core.entity;

import lombok.Data;

@Data
public class AppJava {

	private int id;
	private String gitUri;
	private String branch;
	private String pomPath;
	private int serverPort;
	private int nodePort;
}
