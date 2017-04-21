package com.ssm.mapper.user;

import com.ssm.po.user.T_UserCustom;

public interface UserMapper {
	public T_UserCustom findUserById(int id) throws Exception;
	
	public int findUserCountByUsernameandPassword(T_UserCustom userCustom) throws Exception;
	
	public T_UserCustom findUserIDByUsernameandPassword(T_UserCustom userCustom) throws Exception;
}
