drop table if exists env;

create table env(
    id int primary key auto_increment,
    name varchar(64) not null,
    kind tinyint not null,
    descr varchar(512) not null default "",
    owner varchar(64) not null,
    status tinyint not null default 0,
    ctime datetime not null default CURRENT_TIMESTAMP,
    utime datetime not null default CURRENT_TIMESTAMP,
    unique key uk_kind_name(kind, name)
);

drop table if exists app_basic;

create table app_basic(
    id int primary key auto_increment,
    name varchar(64) not null,
    env_id int not null,
    descr varchar(512) not null default "",
    weight int not null default 50,
    kind tinyint not null,
    status tinyint not null default 0,
    deploy_time datetime,
    ctime datetime not null default CURRENT_TIMESTAMP,
    utime datetime not null default CURRENT_TIMESTAMP,
    unique key uk_envid_name(env_id, name)
);

drop table if exists app_java;

create table app_java(
    id int primary key,
    git_uri varchar(1024) not null,
    branch varchar(128),
    pom_path varchar(128),
    server_port int not null,
    node_port int not null,
    unique key uk_nodeport(node_port)
);

drop table if exists app_config;

create table app_config(
    id int primary key auto_increment,
    app_id int not null,
    kind tinyint not null,
    config_key varchar(128) not null,
    config_value text not null,
    ctime datetime not null default CURRENT_TIMESTAMP,
    utime datetime not null default CURRENT_TIMESTAMP,
    unique key uk_appid_configkey(app_id, config_key)
);

drop table if exists build_log;

create table build_log(
    id int primary key auto_increment,
    app_id int not null,
    log_path varchar(1024) not null,
    ctime datetime not null default CURRENT_TIMESTAMP,
    utime datetime not null default CURRENT_TIMESTAMP
);