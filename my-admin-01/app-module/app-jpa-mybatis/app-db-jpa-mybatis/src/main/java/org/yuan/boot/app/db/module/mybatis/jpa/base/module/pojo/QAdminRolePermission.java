package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminRolePermission is a Querydsl query type for AdminRolePermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminRolePermission extends EntityPathBase<AdminRolePermission> {

    private static final long serialVersionUID = -1964918403L;

    public static final QAdminRolePermission adminRolePermission = new QAdminRolePermission("adminRolePermission");

    public final org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity _super = new org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    //inherited
    public final StringPath createUser = _super.createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Long> permissionId = createNumber("permissionId", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    //inherited
    public final StringPath updateUser = _super.updateUser;

    public QAdminRolePermission(String variable) {
        super(AdminRolePermission.class, forVariable(variable));
    }

    public QAdminRolePermission(Path<? extends AdminRolePermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminRolePermission(PathMetadata metadata) {
        super(AdminRolePermission.class, metadata);
    }

}

