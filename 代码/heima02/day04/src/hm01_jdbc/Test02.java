package hm01_jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//2. �����ƽ��нˮ��Ա����Ϣ
public class Test02 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //��ȡ����
            conn = JdbcUtils.getConnection();
            //��ȡִ��������
            st = conn.createStatement();
            //ִ�����
            String sql = "SELECT *  FROM emp WHERE sal >(SELECT AVG(sal) FROM emp)";
            rs = st.executeQuery(sql);
            //��������
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                int deptno = rs.getInt("deptno");
                System.out.println(empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            //�ͷ���Դ
            JdbcUtils.closeResource(conn,st,rs);
        }
    }
}
