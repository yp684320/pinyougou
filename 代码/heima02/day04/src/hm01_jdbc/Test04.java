package hm01_jdbc;

import java.sql.*;

/*-- 4.  ��ѯ��Scott��ͬ���ŵ�Ա�������͹�������
SELECT ename,hiredate FROM emp  WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'Scott') ;*/
public class Test04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //��ȡ����
        try {
            conn = JdbcUtils.getConnection();
            //���ִ��������
           stmt = conn.createStatement();
           //���ִ�����  ִ��
            String sql = "SELECT ename,hiredate FROM emp  WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'Scott')";
          rs = stmt.executeQuery(sql);
          //������
            while (rs.next()) {
                String ename = rs.getString("ename");
                String hiredate = rs.getString("hiredate");
                System.out.println(ename +" "+hiredate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JdbcUtils.closeResource(conn,stmt,rs);
        }
    }
}
