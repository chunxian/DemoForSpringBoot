package com.company.service;

import com.company.dao.UserRepository;
import com.company.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findName(String name) {
        return userRepository.findName(name);
    }

    @Override
    public void updateNamebyId(Long id, String name){
        userRepository.updateNamebyId(id, name);
    }

    @Override
    public void deleteUserById(Long id){
        userRepository.deleteUserById(id);
    }
}
