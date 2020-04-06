package org.yuan.boot.commons.base.module.pojo;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.IPage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.commons.pojo.BaseCoreQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:05
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class BaseDbQuery extends BaseCoreQuery implements IPage {
    @Override
    public String getOrderBy() {
        return ObjectUtil.defaultIfNull(getOrder(), "").concat(" ").concat(ObjectUtil.defaultIfNull(getSort(), ""));
    }
}
