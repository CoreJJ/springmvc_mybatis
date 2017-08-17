package cn.ums.ssm.daotest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ums.ssm.dao.UserDao;
import cn.ums.ssm.pojo.User;

public class UserDaoImplTest {
	
	private ApplicationContext applicationContext;

	//得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		//调用userDao的方法
		User user = userDao.findUserById(1);
		
		System.out.println(user);
		
	}

}
