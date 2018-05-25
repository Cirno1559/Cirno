package com.hxzy;

public class Student {
/*学生(Student)：
学号(stuNo)，
姓名(stuName)，
年龄(stuAge)，
性别(stuSex)，
联系电话(telephone),
家庭地址(address)

 * */
	private String stuNo;
	private String stuName;
	private Integer stuAge;
	private String stuSex;
	private Integer telephone;
	private String address;
	public Student(String stuNo, String stuName, Integer stuAge, String stuSex, Integer telephone, String address) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.telephone = telephone;
		this.address = address;
	}
	public Student() {
		super();
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((stuAge == null) ? 0 : stuAge.hashCode());
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		result = prime * result + ((stuNo == null) ? 0 : stuNo.hashCode());
		result = prime * result + ((stuSex == null) ? 0 : stuSex.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (stuAge == null) {
			if (other.stuAge != null)
				return false;
		} else if (!stuAge.equals(other.stuAge))
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		if (stuNo == null) {
			if (other.stuNo != null)
				return false;
		} else if (!stuNo.equals(other.stuNo))
			return false;
		if (stuSex == null) {
			if (other.stuSex != null)
				return false;
		} else if (!stuSex.equals(other.stuSex))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex
				+ ", telephone=" + telephone + ", address=" + address + "]";
	} 
	
	
}
