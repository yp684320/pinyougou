package com.itheima.service;

import com.itheima.AccountDao;
import com.itheima.util.C3P0Utils;
import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
    public boolean transfer(String outName,String inName,double money){
        //����Dao�ķ���
        AccountDao dao = new AccountDao();
        //��ȡ����
        Connection conn = null;
        try {
           conn=  C3P0Utils.getConnection();
           //��������
            conn.setAutoCommit(false);
            //����Dao����
           dao.accoutOut(conn,outName,money);
           dao.accountIn(conn,inName,money);
           //�ύ
            DbUtils.commitAndCloseQuietly(conn);
            System.out.println("ת�˳ɹ�");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ת��ʧ��");
            DbUtils.rollbackAndCloseQuietly(conn);
            return false;
        }
    }
}
