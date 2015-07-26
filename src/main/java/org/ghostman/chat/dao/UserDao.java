package org.ghostman.chat.dao;

import org.ghostman.chat.model.User;

public interface UserDao {
	/**
	 * 添加新用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
}
