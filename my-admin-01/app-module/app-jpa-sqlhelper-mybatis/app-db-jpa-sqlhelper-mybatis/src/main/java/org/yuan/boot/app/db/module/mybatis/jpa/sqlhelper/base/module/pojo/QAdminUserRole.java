package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.module.pojo;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.commons.pojo.QBaseEntity;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QAdminUserRole is a Querydsl query type for AdminUserRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUserRole extends EntityPathBase<AdminUserRole> {

    public static final QAdminUserRole adminUserRole = new QAdminUserRole("adminUserRole");
    private static final long serialVersionUID = -206659664L;
    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    //inherited
    public final StringPath createUser = _super.createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    //inherited
    public final StringPath updateUser = _super.updateUser;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QAdminUserRole(String variable) {
        super(AdminUserRole.class, forVariable(variable));
    }

    public QAdminUserRole(Path<? extends AdminUserRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminUserRole(PathMetadata metadata) {
        super(AdminUserRole.class, metadata);
    }

}

