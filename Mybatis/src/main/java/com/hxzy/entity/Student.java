package com.hxzy.entity;

public class Student {
private int sid;
private String sname;
private int cid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, int cid) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.cid = cid;
}

}
