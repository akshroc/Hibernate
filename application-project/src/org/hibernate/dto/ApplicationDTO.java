package org.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "app_table")
public class ApplicationDTO implements Serializable {
	@Id
	@GenericGenerator(name = "application", strategy = "increment")
	@GeneratedValue(generator = "application")
	@Column(name = "app_id")
	private int appId;
	@Column(name = "app_name")
	private String appName;
	@Column(name = "phone_num")
	private long phoneNum;

	public ApplicationDTO() {
		System.out.println(this.getClass().getSimpleName() + " class object is created");
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

}
