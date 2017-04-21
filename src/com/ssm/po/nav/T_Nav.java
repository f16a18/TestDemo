package com.ssm.po.nav;

import java.util.Date;

public class T_Nav {
	private int f_nav_id;
	private int f_next_nav_id;
	private String f_nav_name;
	private String f_nav_url;
	private int f_user_id;
	private int f_isgrand;
	private Date f_creat_date;
	private Date f_upd_date;
	private Date f_operationer_id;
	public int getF_nav_id() {
		return f_nav_id;
	}
	public void setF_nav_id(int f_nav_id) {
		this.f_nav_id = f_nav_id;
	}
	public int getF_next_nav_id() {
		return f_next_nav_id;
	}
	public void setF_next_nav_id(int f_next_nav_id) {
		this.f_next_nav_id = f_next_nav_id;
	}
	public String getF_nav_name() {
		return f_nav_name;
	}
	public void setF_nav_name(String f_nav_name) {
		this.f_nav_name = f_nav_name;
	}
	public String getF_nav_url() {
		return f_nav_url;
	}
	public void setF_nav_url(String f_nav_url) {
		this.f_nav_url = f_nav_url;
	}
	public int getF_user_id() {
		return f_user_id;
	}
	public void setF_user_id(int f_user_id) {
		this.f_user_id = f_user_id;
	}
	public int getF_isgrand() {
		return f_isgrand;
	}
	public void setF_isgrand(int f_isgrand) {
		this.f_isgrand = f_isgrand;
	}
	public Date getF_creat_date() {
		return f_creat_date;
	}
	public void setF_creat_date(Date f_creat_date) {
		this.f_creat_date = f_creat_date;
	}
	public Date getF_upd_date() {
		return f_upd_date;
	}
	public void setF_upd_date(Date f_upd_date) {
		this.f_upd_date = f_upd_date;
	}
	public Date getF_operationer_id() {
		return f_operationer_id;
	}
	public void setF_operationer_id(Date f_operationer_id) {
		this.f_operationer_id = f_operationer_id;
	}
	
}
