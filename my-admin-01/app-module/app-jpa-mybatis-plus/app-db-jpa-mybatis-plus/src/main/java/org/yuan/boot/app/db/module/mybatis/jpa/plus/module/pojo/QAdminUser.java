package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.pojo.QBaseEntity;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QAdminUser is a Querydsl query type for AdminUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUser extends EntityPathBase<AdminUser> {

    public static final QAdminUser adminUser = new QAdminUser("adminUser");
    private static final long serialVersionUID = 1107118106L;
    public final QBaseEntity _super = new QBaseEntity(this);

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

