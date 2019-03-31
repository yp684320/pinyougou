package hm01_jdbc;
/*JDNC��������������
   1,ע������
   2,��ȡ����
   3,��ȡִ��sql������
   4,ִ��sql���
   5,��������
   6,�ͷ���Դ*/
import com.mysql.jdbc.Driver;

import java.sql.*;

public class Demo01_jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1,ע������
      Class.forName("com.mysql.jdbc.Driver");
      //2,��ȡ����
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_332", "root", "root");
        System.out.println(conn);
        //3,��ȡִ��sql������
        Statement stmt = conn.createStatement();
        //4,ִ��sql���
        ResultSet rs = stmt.executeQuery("SELECT  pname,price FROM product2");
        //5��������
        while (rs.next()) {
            String pname = rs.getString("pname");
            int price = rs.getInt("price");
            System.out.println(pname +" "+price);

        }
        //6,�ͷ���Դ
        rs.close();
        stmt.close();
        conn.close();
    }
}
