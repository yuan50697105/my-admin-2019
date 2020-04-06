package org.yuan.boot.app.admin.module.pojo;

import lombok.Data;
import lombok.Singular;
import org.yuan.boot.app.admin.core.constants.form.AdminUserFormValidateConstants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:12
 */

@Data
public class AdminUserFormVO {
    @NotNull(groups = {Update.class, UpdateRole.class}, message = AdminUserFormValidateConstants.ID_NOT_NULL_MSG)
    private Long id;
    @NotBlank(groups = {Save.class}, message = AdminUserFormValidateConstants.USERNAME_NOT_BLANK_MSG)
    private String username;
    @NotBlank(groups = {Save.class}, message = AdminUserFormValidateConstants.PASSWORD_NOT_BLANK_MSG)
    private String password;
    @NotBlank(groups = {Save.class}, message = AdminUserFormValidateConstants.NAME_NOT_BLANK_MSG)
    private String name;
    @Singular
    @NotEmpty(groups = {Save.class, UpdateRole.class}, message = AdminUserFormValidateConstants.ROLE_IDS_NOT_EMPTY_MSG)
    private List<Long> roleIds;
    private String oldPwd;
    private String newPwd;

    public interface Save {
    }

    public interface Update {
    }

    public interface UpdateRole {
    }
}