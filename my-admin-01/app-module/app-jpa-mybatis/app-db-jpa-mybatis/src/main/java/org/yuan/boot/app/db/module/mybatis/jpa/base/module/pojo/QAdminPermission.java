package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminPermission is a Querydsl query type for AdminPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminPermission extends EntityPathBase<AdminPermission> {

    private static final long serialVersionUID = -356449177L;

    public static final QAdminPermission adminPermission = new QAdminPermission("adminPermission");

    public final org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity _super = new org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    //inherited
    public final StringPath createUser = _super.createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    //inherited
    public final StringPath updateUser = _super.updateUser;

    public QAdminPermission(String variable) {
        super(AdminPermission.class, forVariable(variable));
    }

    public QAdminPermission(Path<? extends AdminPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminPermission(PathMetadata metadata) {
        super(AdminPermission.class, metadata);
    }

}

