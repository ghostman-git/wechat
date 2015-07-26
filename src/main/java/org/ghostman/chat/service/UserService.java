package org.ghostman.chat.service;

import org.ghostman.chat.model.User;

public interface UserService {
	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	int insertUser(User user);
}
