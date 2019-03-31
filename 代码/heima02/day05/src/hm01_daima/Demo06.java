package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import utils.C3P0Utils;

import java.sql.SQLException;
import java.util.List;

//ColumnListHandler�����������ָ�����е��ֶ�ֵ����װ��һ��List������
public class Demo06 {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from product ";
        List<Product> list = qr.query(sql, new ColumnListHandler<Product>());
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
