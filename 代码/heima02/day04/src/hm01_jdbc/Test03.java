package hm01_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//3.	��ѯ���в��ŵ����֣�loc��Ա�������͹���ƽ��ֵ ()
public class Test03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {//��ȡ����
            conn = JdbcUtils.getConnection();
            //��ȡִ��������
            st = conn.createStatement();
            //ִ�����
            String sql = "SELECT dname,loc,count(ename),AVG(sal) FROM emp e , dept d WHERE e.deptno = d.deptno GROUP BY e.deptno";
            rs = st.executeQuery(sql);
            //��������
            while (rs.next()) {
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                int anInt = rs.getInt("count(ename)");
                String string = rs.getString("AVG(sal)");
                System.out.println(dname + " " + loc + " " + anInt + " " + string);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            JdbcUtils.closeResource(conn,st,rs);
        }
    }
}
