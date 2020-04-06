package org.yuan.boot.app.admin.module.pojo;

import lombok.Data;
import org.yuan.boot.app.admin.core.constants.form.AdminPermissionFormValidateConstants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:14
 */
@Data
public class AdminPermissionFormVO {
    @NotNull(groups = {Update.class}, message = AdminPermissionFormValidateConstants.ID_NOT_NULL_MSG)
    private Long id;
    @NotBlank(groups = {Save.class, Update.class}, message = AdminPermissionFormValidateConstants.NAME_NOT_BLANK_MSG)
    private String name;

    public interface Save {
    }

    public interface Update {
    }
}