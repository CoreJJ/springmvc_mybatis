package cn.ums.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.ums.ssm.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("test.findUserById", id);

		return user;

	}
	
	


}
