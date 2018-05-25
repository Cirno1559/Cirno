package com.hxzy.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DataSourceUtil3 {
private static ThreadLocal<Connection> local = new ThreadLocal<>();
private static DataSource ds;
static {
	Properties prop = new Properties();
	try {
		prop.load(DataSourceUtil3.class.getClassLoader().getResourceAsStream("dbcp.properties"));
		ds = BasicDataSourceFactory.createDataSource(prop);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static DataSource getDataSource() {
		return ds;
	}
	public static Connection getConnection() {
		Connection conn = local.get();
		if(conn == null) {
			try {
				conn = ds.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			local.set(conn);
		}
		return conn;
	}
	public static void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs) {
			try {
				if(rs != null) {
				rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
					}
				if(conn != null) {
					conn.close();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void release() {
		Connection conn = local.get();
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			local.remove();
		}
	}
}
