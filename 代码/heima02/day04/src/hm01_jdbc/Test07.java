package hm01_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//- 7. 	��ѯ�ڲ��ŵ�locΪ DALLAS �Ĳ��Ź�����Ա����Ա���ţ�
public class Test07 {
    public static void main(String[] args) throws SQLException {
       //��ȡ����
        Connection conn = JdbcUtils.getConnection();
        //���ִ��������
        Statement st = conn.createStatement();
        //ִ�����
        String sql = "select empno from emp e,dept d where e.deptno = d.deptno and loc = (select loc from dept where loc ='DALLAS' ) ";
        ResultSet rs = st.executeQuery(sql);
        //��������
        while (rs.next()) {
            int empno = rs.getInt("empno");
            System.out.println(empno);
        }

        //�ͷ���Դ
        JdbcUtils.closeResource(conn,st,rs);
    }
}
