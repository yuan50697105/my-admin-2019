package org.yuan.boot.commons.base.module.mybatis.jpa.plus.pojo;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.IPage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Pageable pageable() {
        Sort sort = StrUtil.isEmpty(getOrder()) ? Sort.unsorted() : Sort.by(StrUtil.isEmpty(getSort()) ? Sort.Direction.fromString(getSort()) : Sort.Direction.ASC, StrUtil.toCamelCase(getSort()));
        return PageRequest.of(getPageNum() - 1, getPageSize(), sort);
    }
}
