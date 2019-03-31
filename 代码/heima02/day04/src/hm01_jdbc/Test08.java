package hm01_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 8. 	��ѯ��������King��Ա�������͹���
public class Test08 {
    public static void main(String[] args) throws SQLException {
        //��ȡ����
        Connection conn = JdbcUtils.getConnection();
        //���ִ��������
        Statement statement = conn.createStatement();
        //ִ�����
        String sql = "select ename,sal from emp where mgr = (select empno from emp where ename = 'King' )";
        ResultSet rs = statement.executeQuery(sql);
        //��������
        while (rs.next()) {
            String ename = rs.getString("ename");
            String sal = rs.getString("sal");
            System.out.println(ename+" "+sal);
        }
        //�ͷ���Դ
        JdbcUtils.closeResource(conn,statement,rs);
    }
}
