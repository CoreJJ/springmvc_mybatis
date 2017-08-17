package cn.ums.ssm.dao;

import java.util.List;

import cn.ums.ssm.pojo.User;

public interface UserDao {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
	

}
