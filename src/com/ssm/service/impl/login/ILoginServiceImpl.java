package com.ssm.service.impl.login;

import javax.annotation.Resource;

import com.ssm.mapper.user.UserMapper;
import com.ssm.po.user.T_UserCustom;
import com.ssm.service.login.ILoginService;

public class ILoginServiceImpl implements ILoginService{

	@Resource
    private UserMapper userMapper;
	
	@Override
	public int findUserCountByUsernameandPassword(T_UserCustom userCustom) throws Exception {
		
		return (int)userMapper.findUserCountByUsernameandPassword(userCustom);
	}
	
	@Override
	public T_UserCustom findUserIDByUsernameandPassword(T_UserCustom userCustom) throws Exception {
		
		return (T_UserCustom)userMapper.findUserIDByUsernameandPassword(userCustom);
	}

	@Override
	public T_UserCustom findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
