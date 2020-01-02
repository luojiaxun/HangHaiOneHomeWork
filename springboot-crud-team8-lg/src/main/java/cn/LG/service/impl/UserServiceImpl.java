package cn.LG.service.impl;

import cn.LG.dao.UserRepository;
import cn.LG.pojo.User;
import cn.LG.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.saveAndFlush(user);
    }
}
