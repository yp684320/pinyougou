package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.C3P0Utils;

import java.sql.SQLException;

//ScalarHandler���������ڵ����ݡ�����select count(*) from �������
public class Demo05 {
    public static void main(String[] args) throws SQLException {
     //��ȡ���������
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //��дsql��� ��ִ��
        String sql = "select count(*) from product";
        Object o = qr.query(sql, new ScalarHandler<>());
        System.out.println(o);

    }
}
