package com.company.service;

import com.company.entity.User;

public interface IUserService {
    public User findById(Long id);

    public User save(User user);

    public User findName(String name);

    public void updateNamebyId(Long id, String name);

    public void deleteUserById(Long id);
}
