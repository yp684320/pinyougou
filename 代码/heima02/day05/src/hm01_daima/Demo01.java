package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import utils.C3P0Utils;

import java.sql.SQLException;
//ɾ������
public class Demo01 {
    public static void main(String[] args) throws SQLException {
        //���QueryRunnable����
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //дsql���
        String sql = "delete from product where pid = 14";
        int i = qr.update(sql);
        System.out.println(i+"����Ӱ��");
    }
}
