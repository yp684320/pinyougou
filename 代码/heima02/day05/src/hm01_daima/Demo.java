package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import utils.C3P0Utils;

import javax.sql.DataSource;
import java.sql.SQLException;
//�������
public class Demo {
    public static void main(String[] args) throws SQLException {
      //��ȡ���ӳ�
        DataSource ds = C3P0Utils.getDataSource();
        //����queryRunner����
        QueryRunner qr = new QueryRunner(ds);
        //дsql���
        String sql = "insert into product  values (null,'����',5000,'c001')";
        int i = qr.update(sql);
        System.out.println(i+"�� ��Ӱ��");
    }
}
