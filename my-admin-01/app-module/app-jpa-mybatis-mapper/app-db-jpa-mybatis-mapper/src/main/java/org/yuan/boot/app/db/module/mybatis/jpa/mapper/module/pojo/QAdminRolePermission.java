package org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.commons.pojo.QBaseEntity;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QAdminRolePermission is a Querydsl query type for AdminRolePermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminRolePermission extends EntityPathBase<AdminRolePermission> {

    public static final QAdminRolePermission adminRolePermission = new QAdminRolePermission("adminRolePermission");
    private static final long serialVersionUID = -1177678732L;
    public final QBaseEntity _super = new QBaseEntity(this);

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

