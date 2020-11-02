package com.yg.pojo;

import java.util.Date;

public class User {
	//与数据库列名一一对应
	private int id;
	private String username;
	private String password;
	private int role;
	private String mobile;
	private String email;
	private Date regtime;
	private Date updatetime;
	private Date deletetime;
	private int userstatus;
	private String imagepath;
	/**
	 * @return the imagepath
	 */
	public String getImagepath() {
		return imagepath;
	}
	/**
	 * @param imagepath the imagepath to set
	 */
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	//生成get/set方法
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public Date getDeletetime() {
		return deletetime;
	}
	public void setDeletetime(Date deletetime) {
		this.deletetime = deletetime;
	}
	public int getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(int userstatus) {
		this.userstatus = userstatus;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	//无参构造
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public User(int id, String username, String password, int role,
			String mobile, String email, Date regtime, Date updatetime,
			Date deletetime, int userstatus, String imagepath) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.email = email;
		this.regtime = regtime;
		this.updatetime = updatetime;
		this.deletetime = deletetime;
		this.userstatus = userstatus;
		this.imagepath = imagepath;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseUser [id=" + id + ", username=" + username
				+ ", password=" + password + ", role=" + role
				+ ", mobile=" + mobile + ", email=" + email
				+ ", regtime=" + regtime + ", updatetime=" + updatetime
				+ ", deletetime=" + deletetime + ", userstatus="
				+ userstatus + ", imagepath=" + imagepath + "]";
	}
	
	
	

}
