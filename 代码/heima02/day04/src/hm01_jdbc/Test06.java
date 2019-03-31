package hm01_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 6.  ��ѯ�������а�����ĸu��Ա������ͬ���ŵ�Ա����Ա���ź�����
public class Test06 {
    public static void main(String[] args) throws SQLException {
        //��ȡ����
        Connection conn = JdbcUtils.getConnection();
        //���ִ��������
        Statement st = conn.createStatement();
        //ִ�����
        String sql= "select empno,ename from emp where deptno = (select deptno from emp where ename like '%u%') ";
        ResultSet rs = st.executeQuery(sql);
        //��������
        while (rs.next()) {
            String empno = rs.getString("empno");
            String ename = rs.getString("ename");
            System.out.println(empno+" "+ename);
        }
        //�ͷ���Դ
        JdbcUtils.closeResource(conn,st,rs);
    }
}
