package com.muratprojects.redisdemo.service;

import com.muratprojects.redisdemo.entity.User;
import com.muratprojects.redisdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public User save(User user){
        return userRepository.save(user);
    }
    public User getById(Integer id){
        return userRepository.findById(id).orElse(null);
    }
}
