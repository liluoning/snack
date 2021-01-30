package com.snack.model;

import java.sql.Date;

public class Favorite {
	
	private Integer id;
	private Integer uId;
	private Integer sId;
	private Date CreateTime;
	public Favorite() {
		super();
	}
	public Favorite(Integer id, Integer uId, Integer sId, Date createTime) {
		super();
		this.id = id;
		this.uId = uId;
		this.sId = sId;
		CreateTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", uId=" + uId + ", sId=" + sId + ", CreateTime=" + CreateTime + "]";
	}
	
	

}
