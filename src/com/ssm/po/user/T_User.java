package com.ssm.po.user;

import java.io.Serializable;
import java.util.Date;

public class T_User {
	private Integer f_user_id;
    private String f_username;
    private String f_password;
    private String f_sex;
    private String f_email;
    private Date f_birthday;
    private String f_IDCode;
    private String f_phone;
    private Date f_creat_date;
    private Date f_upd_date;
    private Date f_operation_id;
	public Integer getF_user_id() {
		return f_user_id;
	}
	public void setF_user_id(Integer f_user_id) {
		this.f_user_id = f_user_id;
	}
	public String getF_username() {
		return f_username;
	}
	public void setF_username(String f_username) {
		this.f_username = f_username;
	}
	public String getF_password() {
		return f_password;
	}
	public void setF_password(String f_password) {
		this.f_password = f_password;
	}
	public String getF_sex() {
		return f_sex;
	}
	public void setF_sex(String f_sex) {
		this.f_sex = f_sex;
	}
	public String getF_email() {
		return f_email;
	}
	public void setF_email(String f_email) {
		this.f_email = f_email;
	}
	public Date getF_birthday() {
		return f_birthday;
	}
	public void setF_birthday(Date f_birthday) {
		this.f_birthday = f_birthday;
	}
	public String getF_IDCode() {
		return f_IDCode;
	}
	public void setF_IDCode(String f_IDCode) {
		this.f_IDCode = f_IDCode;
	}
	public String getF_phone() {
		return f_phone;
	}
	public void setF_phone(String f_phone) {
		this.f_phone = f_phone;
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
	public Date getF_operation_id() {
		return f_operation_id;
	}
	public void setF_operation_id(Date f_operation_id) {
		this.f_operation_id = f_operation_id;
	}
    
    
}