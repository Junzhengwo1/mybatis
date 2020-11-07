package com.kou.dao;

import com.kou.domain.User;

import java.util.List;

/**
 * @author dell
 */
public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
