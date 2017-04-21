package com.ssm.po;

import java.util.List;

import com.ssm.po.nav.T_NavCustom;

public class Navquery {
	private int user_id;
	private String username;
	private List<T_NavCustom> navCustom;
		
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<T_NavCustom> getNavCustom() {
		return navCustom;
	}
	public void setNavCustom(List<T_NavCustom> navCustom) {
		this.navCustom = navCustom;
	}
	
	
	
}
