package org.ghostman.chat.service.impl;

import org.ghostman.chat.dao.UserDao;
import org.ghostman.chat.model.User;
import org.ghostman.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
     
    @Override
    public int insertUser(User user) {
        // TODO Auto-generated method stub
        return userDao.insertUser(user);
    }

}
