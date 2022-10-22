package t20.app.impl;

import t20.app.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
    public BaseDaoImpl() {
        System.out.println("BaseDaoImpl initialized...");
    }

    @Override
    public void save(T e) {
        System.out.println("Save " + e);
    }
}
