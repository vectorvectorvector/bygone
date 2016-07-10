package com.bygone.www.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bygone.www.model.Diary;
import com.bygone.www.model.User;

/**
 * 面向接口编程
 * @author 周超
 */
public interface userOperation 
{
	/**根据ID查询用户
	 * 只有一个参数的时候两种写法都可以
	 * @Select("select * from users where id=#{0}")
	 * @Select("select * from users where id=#{id}")
	 * @param id
	 * @return
	 */
	@Select("select * from users where id=#{id}")
	public User	getUserById(int id);//根据id来获取用户
	
	/**根据用户名和密码查询用户
	 * 使用注解的方式根据条件查询数据
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	@Select({"select * from users where username=#{0} and password=#{1}"})
	public User getUserByNameAndPassword(String username,String password);
	
	
	/**
	 * 查询多条数据返回List
	 */
	@Select("select * from users")
	public List<User>getAllUser();
	
	/**
	 * 向数据库中添加数据
	 * @param user
	 * @return
	 */
	@Insert("insert into users(username,password) values(#{username},#{password})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public int addUser(User user);
	
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	@Delete("delete from users where id=#{id}")
	public int deleteUser(int id);
	
	/**
	 * 更新数据
	 * @param user
	 * @return
	 */
	@Update("update users set username=#{username},password=#{password} where id=#{id}")
	public int updateUser(User user);
	
	
	@Select("select * from diary,users where diary.username=users.username")
	public List<Diary>getDiary();
}
