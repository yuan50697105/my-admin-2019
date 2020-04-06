package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminRole is a Querydsl query type for AdminRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminRole extends EntityPathBase<AdminRole> {

    private static final long serialVersionUID = 879333646L;

    public static final QAdminRole adminRole = new QAdminRole("adminRole");

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

    public QAdminRole(String variable) {
        super(AdminRole.class, forVariable(variable));
    }

    public QAdminRole(Path<? extends AdminRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminRole(PathMetadata metadata) {
        super(AdminRole.class, metadata);
    }

}

