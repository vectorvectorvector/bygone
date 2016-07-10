package com.bygone.www.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis工具类
 * @author 周超
 *
 */
public class MybatisUtil 
{
	/**
	 * 获取SqlSessionFactory
	 * @return SqlSessionFactory
	 */
	public static SqlSessionFactory	getSqlSessionFactory()
	{
		String resource="config_mybatis.xml";
		SqlSessionFactory sessionFactory = null; 
		try {
			Reader reader=Resources.getResourceAsReader(resource);
			sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}
	
	/**
	 * 获取SqlSession
	 * @return
	 */
	public static SqlSession getSqlSession()
	{
		return getSqlSessionFactory().openSession();
	}

	/**
	* 获取SqlSession
	* @param isAutoCommit 
	*        true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务
	*        false 表示创建的SqlSession对象在执行完SQL之后不会自动提交事务，
	*        这时就需要我们手动调用sqlSession.commit()提交事务
	* @return SqlSession
	*/
	public static SqlSession getSqlSession(boolean isAutoCommit)
	{
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
