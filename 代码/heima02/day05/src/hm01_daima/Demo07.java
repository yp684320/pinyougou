package hm01_daima;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import utils.C3P0Utils;

import java.sql.SQLException;

public class Demo07 {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "insert into user values(1,'С��','123')";
        int i = qr.update(sql);
        System.out.println(i);
        //�������
        //��ȡ���������
       /* QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //��дsql���  ��ִ��
        String sql = "insert into user values(null,'����','789')";
        int i = qr.update(sql);
        System.out.println(i+"�� ��Ӱ��");*/
        //ɾ������
        //��ȡ���������
      /*  QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        //��дsql���  ��ִ��
        String sql = "delete from user where id = 1";
        int i = qr.update(sql);
        System.out.println(i+"�� ��Ӱ��");*/

      //������
        QueryRunner qr1 = new QueryRunner(C3P0Utils.getDataSource());
        String sql1= "update user set uname = '���' where id = 2";
        int i1 = qr.update(sql1);
        System.out.println(i1);
    }
}
