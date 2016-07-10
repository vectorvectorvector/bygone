package com.bygone.www.model;

//个人日记
public class Diary 
{
	private int id;//id
	private String username;//发表日记的用户名
	private int type;//文章类型
	private String title;//日记标题
	private String content;//内容
	private String image;//用到的图片
	private String comment_reply;//评论和回复
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getComment_reply() {
		return comment_reply;
	}
	public void setComment_reply(String comment_reply) {
		this.comment_reply = comment_reply;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return id+" "+username+" "+type+" "+title+" "+content+" "+image+" "+comment_reply;
	}
}
