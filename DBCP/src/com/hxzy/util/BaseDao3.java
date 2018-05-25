package com.hxzy.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

public class BaseDao3 {
protected Connection conn;
protected PreparedStatement pstmt;
protected ResultSet rs;

	public int executeUpdata(String sql,Object...params) {
		this.conn = DataSourceUtil.getConnection();
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			if(params != null) {
				for (int i = 0; i < params.length; i++) {
					this.pstmt.setObject(i+1, params[i]);
				}
			}
			return this.pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeAll(this.conn, this.pstmt, this.rs);
		}
		return 0;
		
	}
	public <T> List<T> query(Class<T> claz,String sql,Object...params){
		this.conn = DataSourceUtil.getConnection();
		List<T> list = new ArrayList<>();
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			if(params != null) {
				for (int i = 0; i < params.length; i++) {
					this.pstmt.setObject(i+1, params[i]);
				}
			}
			this.rs = this.pstmt.executeQuery();
			ResultSetMetaData rsmd = this.rs.getMetaData();
			int columCount = rsmd.getColumnCount();
			while(this.rs.next()) {
				T obj = claz.newInstance();
				for (int i = 0; i < columCount; i++) {
					Object value = this.rs.getObject(i+1);
					String columeLabel = rsmd.getColumnLabel(i+1);
					BeanUtils.setProperty(obj, columeLabel, value);
				}
				list.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeAll(this.conn, this.pstmt, this.rs);
		}
		return list;
	}
}
