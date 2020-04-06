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
 * QAdminRole is a Querydsl query type for AdminRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminRole extends EntityPathBase<AdminRole> {

    public static final QAdminRole adminRole = new QAdminRole("adminRole");
    private static final long serialVersionUID = 1107025093L;
    public final QBaseEntity _super = new QBaseEntity(this);

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

