package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminUser is a Querydsl query type for AdminUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUser extends EntityPathBase<AdminUser> {

    private static final long serialVersionUID = 879426659L;

    public static final QAdminUser adminUser = new QAdminUser("adminUser");

    public final org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity _super = new org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    //inherited
    public final StringPath createUser = _super.createUser;

    public final NumberPath<Integer> enabled = createNumber("enabled", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    //inherited
    public final StringPath updateUser = _super.updateUser;

    public final StringPath username = createString("username");

    public QAdminUser(String variable) {
        super(AdminUser.class, forVariable(variable));
    }

    public QAdminUser(Path<? extends AdminUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminUser(PathMetadata metadata) {
        super(AdminUser.class, metadata);
    }

}

