package com.itheima.util;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Utils {
     //�������ӳض���
  public static DataSource ds = new ComboPooledDataSource();
  //�����ӳ��л�ȡ����
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    public static DataSource getDataSource(){
        return ds;
    }

}
