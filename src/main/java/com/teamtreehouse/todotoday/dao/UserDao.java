package com.teamtreehouse.todotoday.dao;

import com.teamtreehouse.todotoday.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kylebudd on 9/14/17.
 */
@Repository
public interface UserDao extends CrudRepository<User,Long> {
    User findByUsername(String userName);
}
