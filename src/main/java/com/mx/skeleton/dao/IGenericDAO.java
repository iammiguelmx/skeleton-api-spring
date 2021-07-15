package com.mx.skeleton.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author Miguel Camacho
 * @param <T>
 * @param <ID>
 */
public interface IGenericDAO<T, ID extends Serializable> {

    T findById(ID id);

    T persist(T entity);

    List<T> findAll(int maxResults);
}
