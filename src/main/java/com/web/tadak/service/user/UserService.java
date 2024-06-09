package com.web.tadak.service.user;

import com.web.tadak.entity.user.User;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    User updateUser(User user);
    void deleteUser(Long id);

}
