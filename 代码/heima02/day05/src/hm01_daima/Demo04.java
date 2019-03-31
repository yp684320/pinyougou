package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.C3P0Utils;

import java.sql.SQLException;
import java.util.List;

//BeanListHandler�����������ÿһ����¼��װ��ָ����javaBean�У�����ЩjavaBean�ڷ�װ��List������
public class Demo04 {
    public static void main(String[] args) throws SQLException {
        //��ȡ���������
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //��дsql���  ��ִ��
        String sql = "select * from product";
        List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));
        //��������
        for (Product product : list) {
            System.out.println(product);
        }

    }
}
