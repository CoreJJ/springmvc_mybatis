package cn.ums.ssm.mapper;

import java.util.List;

import cn.ums.ssm.pojo.User;
import cn.ums.ssm.pojo.UserCustom;
import cn.ums.ssm.pojo.UserQueryVo;


public interface UserMapper {
	
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
		

}
