package com.anderson.core.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anderson.api.api.pojo.User;
import com.anderson.core.repository.UserRepository;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Override
    public User findById(Long id) {
        logger.debug("findById# id = " + id);
        Optional result = userRepository.findById(id);
        logger.debug("findById# result = " + result);
        if (result.isPresent())
            return (User)result.get();
        else
            return null;
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Override
    public void deleteAllUsers() {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
