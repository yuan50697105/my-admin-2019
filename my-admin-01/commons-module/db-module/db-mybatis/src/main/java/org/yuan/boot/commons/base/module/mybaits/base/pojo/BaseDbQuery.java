package org.yuan.boot.commons.base.module.mybaits.base.pojo;

import cn.hutool.core.util.StrUtil;
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
        String orderBy = "";
        orderBy += StrUtil.isEmpty(getOrder()) ? "" : StrUtil.toUnderlineCase(getOrder());
        orderBy += " ";
        orderBy += StrUtil.isEmpty(getSort()) ? "" : getSort();
        return orderBy.trim();
    }
}
