package net.callofdroidy.torontoroadincidents.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import net.callofdroidy.torontoroadincidents.Closure;

import net.callofdroidy.torontoroadincidents.greendao.gen.ClosureDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig closureDaoConfig;

    private final ClosureDao closureDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        closureDaoConfig = daoConfigMap.get(ClosureDao.class).clone();
        closureDaoConfig.initIdentityScope(type);

        closureDao = new ClosureDao(closureDaoConfig, this);

        registerDao(Closure.class, closureDao);
    }
    
    public void clear() {
        closureDaoConfig.clearIdentityScope();
    }

    public ClosureDao getClosureDao() {
        return closureDao;
    }

}
