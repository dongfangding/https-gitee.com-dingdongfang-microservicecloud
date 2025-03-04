package com.ddf.microservicecloud.provider.dao;

import com.ddf.microservicecloud.api.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author DDf on 2018/5/14
 */
public interface UserDao {

    List<User> findAll();

    User getOne(Integer id);

    List<Map<String, Object>> findAllMap();

    User updateOne(User user);

    void delete(Integer id);
}
