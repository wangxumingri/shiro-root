drop table if exists core_users;

/*==============================================================*/
/* Table: core_users                                            */
/*==============================================================*/
create table core_users
(
    uid              	 bigint(20) not null auto_increment,
    name                 varchar(120),
    loginId              varchar(100),
    password             varchar(120),
    status               char(1) comment '用户状态',
    loginSuccessCount    int(11) comment '登录成功总次数',
    lastLoginSuccessTime timestamp comment '最后一次成功登录时间',
    lastLoginFailureTime timestamp comment '最后一次失败登录时间',
    lastLoginIP          varchar(40) comment '最后一次登录IP地址',
    createDate           datetime,
    lastUpdateDate       datetime,
    firstLogin           smallint(6) comment '初次登录标识',
    loginFailureCount    smallint(6) comment '连续登录失败次数',
    createUser           varchar(100),
    lastUpdateUser       varchar(100),
    appId                varchar(30) comment '应用id',
    primary key (uid)
);