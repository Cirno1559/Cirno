package com.hxzy.entity;

import java.io.Serializable;

public class Hero implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer hId;
	public Integer gethId() {
		return hId;
	}
	public void sethId(Integer hId) {
		this.hId = hId;
	}
	private String hName;
	private Integer hLevel;
	private String hType;
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public Integer gethLevel() {
		return hLevel;
	}
	public void sethLevel(Integer hLevel) {
		this.hLevel = hLevel;
	}
	public String gethType() {
		return hType;
	}
	public void sethType(String hType) {
		this.hType = hType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hLevel == null) ? 0 : hLevel.hashCode());
		result = prime * result + ((hName == null) ? 0 : hName.hashCode());
		result = prime * result + ((hType == null) ? 0 : hType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		if (hLevel == null) {
			if (other.hLevel != null)
				return false;
		} else if (!hLevel.equals(other.hLevel))
			return false;
		if (hName == null) {
			if (other.hName != null)
				return false;
		} else if (!hName.equals(other.hName))
			return false;
		if (hType == null) {
			if (other.hType != null)
				return false;
		} else if (!hType.equals(other.hType))
			return false;
		return true;
	}
	public Hero(String hName, Integer hLevel, String hType) {
		super();
		this.hName = hName;
		this.hLevel = hLevel;
		this.hType = hType;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
