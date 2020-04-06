create schema if not exists my_admin_shower collate utf8mb4_0900_ai_ci;
use my_admin_shower;
create table if not exists admin_permission
(
    id          bigint(15)  not null comment 'id'
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
    id          bigint(15)  not null comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    name        varchar(50) null comment 'name'
)
    comment 'admin_role';

create table if not exists admin_role_permission
(
    id            bigint(15)  not null comment 'id'
        primary key,
    create_user   varchar(50) null comment 'createUser',
    update_user   varchar(50) null comment 'updateUser',
    create_time   datetime    null comment 'createTime',
    update_time   timestamp   null comment 'updateTime',
    role_id       bigint(15)  null comment 'roleId',
    permission_id bigint(15)  null comment 'permissionId'
)
    comment 'admin_role_permission';

create table if not exists admin_user
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    username    varchar(50) null comment 'username',
    password    varchar(50) null comment 'password',
    name        varchar(50) null comment 'name',
    enabled     int         null comment 'enabled'
)
    comment 'admin_user';

create table if not exists admin_user_role
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    user_id     bigint(15)  null comment 'userId',
    role_id     bigint(15)  null comment 'roleId'
)
    comment 'admin_user_role';

create table if not exists customer_info
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    open_id     varchar(50) null comment '微信OPEN_ID',
    union_id    varchar(50) null comment '微信UNION_ID',
    nick_name   varchar(50) null comment '微信昵称',
    phone       varchar(50) null comment '电话',
    gender      varchar(50) null comment '性别',
    enabled     int         null comment '状态'
)
    comment 'customer_info';

create table if not exists device_info
(
    id          bigint(15)  not null comment 'id'
        primary key,
    create_user varchar(50) null comment 'createUser',
    update_user varchar(50) null comment 'updateUser',
    create_time datetime    null comment 'createTime',
    update_time timestamp   null comment 'updateTime',
    code        varchar(50) null comment 'code',
    type        int         null comment 'type',
    range_code  varchar(50) null comment 'rangeCode'
)
    comment 'device_info';

create table if not exists order_info
(
    id                bigint(15)     not null comment 'id'
        primary key,
    create_user       varchar(50)    null comment 'createUser',
    update_user       varchar(50)    null comment 'updateUser',
    create_time       datetime       null comment 'createTime',
    update_time       timestamp      null comment 'updateTime',
    order_no          varchar(50)    null comment '订单号',
    customer_id       varchar(50)    null comment '客户ID',
    customer_open_id  varchar(50)    null comment '微信OPENID',
    customer_union_id varchar(50)    null comment '微信UNIONID',
    total_price       decimal(13, 4) null comment '订单总价',
    type              int            null comment '订单类型'
)
    comment 'order_info';

create table if not exists order_item
(
    id                bigint(15)     not null comment 'id'
        primary key,
    create_user       varchar(50)    null comment 'createUser',
    update_user       varchar(50)    null comment 'updateUser',
    create_time       datetime       null comment 'createTime',
    update_time       timestamp      null comment 'updateTime',
    order_no          varchar(50)    null comment '订单号',
    customer_id       varchar(50)    null comment '客户ID',
    customer_open_id  varchar(50)    null comment '微信OPENID',
    customer_union_id varchar(50)    null comment '微信UNIONID',
    total_price       decimal(13, 4) null comment '订单总价',
    type              int            null comment '订单类型',
    price_id          bigint(15)     null comment '定价ID',
    price_context     varchar(50)    null comment '定价描述',
    price_code        varchar(50)    null comment '定价编号',
    price             decimal(13, 4) null comment '单价',
    number            double(16, 4)  null comment '数量',
    item_total_price  decimal(13, 4) null comment '商品总价'
)
    comment 'order_item';

create table if not exists price_info
(
    id             bigint(15)                                   not null comment 'id'
        primary key,
    create_user    varchar(50)    default ''                    not null comment 'createUser',
    update_user    varchar(50)    default ''                    not null comment 'updateUser',
    create_time    datetime       default '1000-01-01 00:00:00' not null comment 'createTime',
    update_time    timestamp      default CURRENT_TIMESTAMP     not null on update CURRENT_TIMESTAMP comment 'updateTime',
    code           varchar(50)    default ''                    not null comment '定价编号',
    type           int            default -1                    not null comment '定价类型',
    range_code     varchar(50)    default ''                    not null comment '区域码',
    time_price     decimal(13, 4) default -1.0000               not null comment '时间计费单价',
    time_interval  double(16, 4)  default -1.0000               not null comment '时间计费间隔 (单位分钟）',
    water_price    decimal(13, 4) default -1.0000               not null comment '水费计费单价',
    water_interval double(16, 4)  default -1.0000               not null comment '水费计费间隔 （升)'
)
    comment 'price_info';

