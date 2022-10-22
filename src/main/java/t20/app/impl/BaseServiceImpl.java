package t20.app.impl;

import org.springframework.beans.factory.annotation.Autowired;
import t20.app.BaseDao;
import t20.app.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseDao<T> dao;

    @Override
    public void stat(T e) {
        dao.save(e);
    }
}
