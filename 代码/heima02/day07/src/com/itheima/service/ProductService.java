package com.itheima.service;

import com.itheima.dao.ProductDao;
import java.sql.SQLException;

public class ProductService {
    public String insert( int id, String pname, int price){
        ProductDao dao = new ProductDao();
        //���÷���
        try {
            int flag = dao.insert( id, pname, price);
            if (flag == 1) {
               return "��ӳɹ�";
            } else {
               return "���ʧ��";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("���ʧ��");
        }
        return "�����쳣 ";

    }
}
