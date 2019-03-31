package hm01_jdbc;

import java.sql.*;

//1. �����нˮ��Ա����Ϣ
public class Test01 {
    public static void main(String[] args) throws SQLException {
        //1,��ȡ����
        Connection conn = JdbcUtils.getConnection();
        //2,��ȡsql����ִ�ж���
        Statement stmt = conn.createStatement();
        //3,ִ��sql���
        String sql= "SELECT *,max(sal) FROM  emp";
        ResultSet rs = stmt.executeQuery(sql);
        //4,������
        while (rs.next()) {
            int empno = rs.getInt("empno");
            String ename = rs.getString("ename");
            String job = rs.getString("job");
            int mgr = rs.getInt("mgr");
            String hiredate = rs.getString("hiredate");
            String sal = rs.getString("sal");
            String comm = rs.getString("comm");
            int deptno = rs.getInt("deptno");
            String s = rs.getString("max(sal)");
            System.out.println(empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno+" "+s);
        }
        System.out.println();
        //5,�ͷ���Դ
        JdbcUtils.closeResource(conn,stmt,rs);


    }
}
