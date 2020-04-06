package org.yuan.boot.app.admin.module.pojo;

import lombok.Data;
import org.yuan.boot.app.admin.core.constants.form.AdminRoleFormValidateConstants;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:13
 */
@Data
public class AdminRoleFormVO {
    @NotNull(groups = {UpdateInfo.class, UpdatePermission.class}, message = AdminRoleFormValidateConstants.ID_NOT_NULL_MSG)
    private Long id;
    @NotBlank(groups = {Save.class, UpdateInfo.class}, message = AdminRoleFormValidateConstants.NAME_NOT_BLANK_MSG)
    private String name;
    @NotEmpty(groups = {Save.class, UpdatePermission.class}, message = AdminRoleFormValidateConstants.PERMISSION_IDS_NOT_EMPTY_MSG)
    private List<Long> permissionIds;

    public interface Save {
    }

    public interface UpdateInfo {
    }

    public interface UpdatePermission {
    }
}