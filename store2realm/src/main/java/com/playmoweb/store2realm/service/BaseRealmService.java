package com.playmoweb.store2realm.service;

import com.playmoweb.store2realm.dao.RealmDao;
import com.playmoweb.store2store.service.AbstractService;
import com.playmoweb.store2store.utils.Filter;
import com.playmoweb.store2store.utils.NullObject;
import com.playmoweb.store2store.utils.SortingMode;

import java.util.List;

import io.reactivex.Observable;
import io.realm.RealmObject;

/**
 * This class try to facilitate usage of Realm with any other async storage system.
 * For now this abstract class implements the most basics CRUD operations only.
 *
 * @author  Thibaud Giovannetti
 * @by      Playmoweb
 * @date    31/01/2017
 *
 * @update  hoanghiep
 * @date    28/07/2017
 */
public abstract class BaseRealmService<T extends RealmObject> extends AbstractService<T> {
    /**
     * Public constructor
     *
     * @param clazz
     */
    public BaseRealmService(Class<T> clazz) {
        super(clazz, new RealmDao<>(clazz));
    }

    @Override
    protected Observable<List<T>> getAll(Filter filter, SortingMode sortingMode) {
        return null;
    }

    @Override
    protected Observable<T> getOne(Filter filter, SortingMode sortingMode) {
        return null;
    }

    @Override
    protected Observable<T> getById(int id) {
        return null;
    }

    @Override
    protected Observable<T> insert(T object) {
        return null;
    }

    @Override
    protected Observable<List<T>> insert(List<T> items) {
        return null;
    }

    @Override
    protected Observable<T> update(T object) {
        return null;
    }

    @Override
    protected Observable<List<T>> update(List<T> items) {
        return null;
    }

    @Override
    protected Observable<NullObject> delete(List<T> items) {
        return null;
    }

    @Override
    protected Observable<NullObject> delete(T object) {
        return null;
    }

    @Override
    protected Observable<NullObject> deleteAll() {
        return null;
    }
}
