package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;
import tk.mybatis.mapper.genid.GenId;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 20:20
 */
@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public class SnowFlakeGenId implements GenId<Long> {
    @SuppressWarnings("SpringJavaAutowiredMembersInspection")
    @Autowired
    private SnowFlake snowFlake;

    @Override
    public Long genId(String table, String column) {
        return snowFlake.nextId();
    }
}