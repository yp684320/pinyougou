package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.C3P0Utils;

import java.sql.SQLException;

//BeanHandler����������е�һ����¼��װ��һ��ָ����javaBean��

public class Demo03 {
    public static void main(String[] args) throws SQLException {
    //��ȡ���������
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //��дsql���  ��ִ��
        String sql = "select * from product ";
        Product product = qr.query(sql, new BeanHandler<Product>(Product.class));
        System.out.println(product);
    }
}
