package com.bygone.www.model;

import java.io.Serializable;

public class User implements Serializable 
{
	private String username;//用户名
	private String password;//密码
	private int id;//id
	private String head;//头像
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	@Override
	public String toString() {
		return "id="+id+"  username="+username+"  password="+password+" 头像="+head;
	}
}
