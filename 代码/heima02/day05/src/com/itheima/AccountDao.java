package com.itheima;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.Connection;
import java.sql.SQLException;
//�˴����쳣�����쳣
public class AccountDao {
    QueryRunner qr = new QueryRunner();
    public void accoutOut(Connection connection, String outName, double money) throws SQLException {
        //��ȡִ�ж���

            String sql_out = "update account set  money = money - ? where name = ?";
            qr.update(connection, sql_out, money, outName);

    }


    public void accountIn(Connection connection, String inName, double money) throws SQLException {

             String sql_in = "update account set  money = money + ? where name = ?";
             qr.update(connection, sql_in, money, inName);

    }
}
