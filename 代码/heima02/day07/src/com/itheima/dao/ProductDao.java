package com.itheima.dao;

import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;


import java.sql.SQLException;

public class ProductDao {
    //�������
    public int insert( int id, String pname, int price) throws SQLException {
        //��ȡ���������
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //дsql���
        String sql = "insert into product values(?,?,?)";
        //ִ�����
        int flag = qr.update( sql, id, pname, price);
        return flag;

    }

}
