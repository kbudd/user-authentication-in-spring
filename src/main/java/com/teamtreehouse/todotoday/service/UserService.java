package com.teamtreehouse.todotoday.service;

import com.teamtreehouse.todotoday.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by kylebudd on 9/14/17.
 */
public interface UserService extends UserDetailsService {
    User findByUsername(String userName);
}
