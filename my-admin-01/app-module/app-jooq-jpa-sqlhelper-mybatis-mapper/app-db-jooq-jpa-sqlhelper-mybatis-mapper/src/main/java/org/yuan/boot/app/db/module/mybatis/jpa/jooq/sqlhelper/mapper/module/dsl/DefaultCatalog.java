/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dsl;


import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DefaultCatalog extends CatalogImpl {

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();
    private static final long serialVersionUID = -824189632;
    /**
     * The schema <code>my_admin_01</code>.
     */
    public final MyAdmin_01 MY_ADMIN_01 = MyAdmin_01.MY_ADMIN_01;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
                MyAdmin_01.MY_ADMIN_01);
    }
}
