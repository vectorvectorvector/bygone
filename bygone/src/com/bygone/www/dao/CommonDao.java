package com.bygone.www.dao;

import java.util.List;
import java.util.Random;

import org.apache.ibatis.session.SqlSession;
import com.bygone.www.interfaces.userOperation;
import com.bygone.www.model.Diary;
import com.bygone.www.model.User;
import com.bygone.www.util.MybatisUtil;

public class CommonDao {
	public static void main(String[] args) {
		SqlSession session=MybatisUtil.getSqlSession();
		userOperation operation=session.getMapper(userOperation.class);
		
//		//根据ID查询用户
//		User user=operation.getUserById(1);
//		System.out.println(user.toString());
//		
//		//根据用户名和密码查询用户
//		User user2=operation.getUserByNameAndPassword("c", "d");
//		System.out.println(user2.toString());
		
//		//查询多条数据返回List
//		userOperation operationList=session.getMapper(userOperation.class);
//		List<User>lists=operationList.getAllUser();
//		for (User user : lists) {
//			System.out.println(user.toString());
//		}
		
//		//添加用户
//		User user3=new User();
//		Random random=new Random();
//		user3.setUsername("大连理工"+random.nextInt());
//		user3.setPassword("235472");
//		operation.addUser(user3);
//		session.commit();
//		System.out.println(user3.toString());
//		session.close();
		
//		//删除用户
//		userOperation delete=session.getMapper(userOperation.class);
//		User udelete=delete.getUserById(6);
//		int de=delete.deleteUser(udelete.getId());
//		session.commit();
//		System.out.println(de);
		
//		//更新用户
//		userOperation update=session.getMapper(userOperation.class);
//		User user=update.getUserById(2);
//		user.setUsername("辽宁省大连市甘井子区大连理工大学");
//		int x=update.updateUser(user);
//		session.commit();
//		session.close();
//		System.out.println(x);
		
		List<Diary>diaries=operation.getDiary();
		for (Diary diary : diaries) {
			System.out.println(diary);
		}
		
	}
	
}
