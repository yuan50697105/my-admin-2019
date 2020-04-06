package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminUserRole is a Querydsl query type for AdminUserRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUserRole extends EntityPathBase<AdminUserRole> {

    private static final long serialVersionUID = -735639687L;

    public static final QAdminUserRole adminUserRole = new QAdminUserRole("adminUserRole");

    public final org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity _super = new org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity(this);

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

