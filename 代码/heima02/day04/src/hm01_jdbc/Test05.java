package hm01_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//5.  ��ѯ���ʱȹ�˾ƽ�����ʵ׵�Ա����Ա���ţ������͹��ʡ�
public class Test05 {
    public static void main(String[] args) throws SQLException {
        //��ȡ����
        Connection conn = JdbcUtils.getConnection();
        //������ִ�ж���
        Statement stmt = conn.createStatement();
        //ִ�����
        String sql= "select empno,ename ,sal from emp where sal < (select avg(sal) from emp ) ";
        ResultSet rs = stmt.executeQuery(sql);
        //��������
        while (rs.next()) {
            String empno = rs.getString("empno");
            String ename = rs.getString("ename");
            String sal = rs.getString("sal");
            System.out.println(empno+" "+ename+" "+sal);
        }
        //�ͷ���Դ
        JdbcUtils.closeResource(conn,stmt,rs);
    }
}
