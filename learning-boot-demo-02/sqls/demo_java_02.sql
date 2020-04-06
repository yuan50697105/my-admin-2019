create schema if not exists demo_java_02 collate utf8mb4_0900_ai_ci;

create table if not exists admin_permission
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    name        varchar(50) null comment 'name'
)
    comment 'admin_permission';

create table if not exists admin_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    name        varchar(50) null comment 'name',
    enabled     int         null comment 'enabled'
)
    comment 'admin_role';

create table if not exists admin_role_permission
(
    id            bigint(15) auto_increment comment 'id'
        primary key,
    create_user   varchar(50) default ''                    not null comment 'createUser',
    update_user   varchar(50) default ''                    not null comment 'updateUser',
    create_time   datetime    default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time   timestamp   default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    role_id       bigint(15)  default -1                    not null comment 'roleId',
    permission_id bigint(15)  default -1                    not null comment 'permissionId'
)
    comment 'admin_role_permission';

create table if not exists admin_user
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_user varchar(50) default ''                    not null comment 'createUser',
    update_user varchar(50) default ''                    not null comment 'updateUser',
    create_time datetime    default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time timestamp   default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    username    varchar(50) default ''                    not null comment 'username',
    password    varchar(50) default ''                    not null comment 'password',
    name        varchar(50) default ''                    not null comment 'name',
    enabled     int         default -1                    not null comment 'enabled',
    constraint username
        unique (username)
)
    comment 'admin_user';

create table if not exists admin_user_role
(
    id          bigint(15) auto_increment comment 'id'
        primary key,
    create_user varchar(50) default ''                    not null comment 'createUser',
    update_user varchar(50) default ''                    not null comment 'updateUser',
    create_time datetime    default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time timestamp   default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    user_id     bigint(15)  default -1                    not null comment 'userId',
    role_id     bigint(15)  default -1                    not null comment 'roleId'
)
    comment 'admin_user_role';

