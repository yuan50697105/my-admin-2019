package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.DeviceInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.mapper.DeviceInfoMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.DeviceInfo;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 01:28
 */
@Component
@AllArgsConstructor
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
}