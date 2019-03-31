package hm01_jdbc;

import java.sql.*;

/*����������*/
public class JdbcUtils {
   private static String driver = "com.mysql.jdbc.Driver";
   private static String url = "jdbc:mysql://localhost:3306/day03";
      private static String user = "root";
      private static String password = "root";

      static{
       try { //ע������
           Class.forName(driver);
       } catch (ClassNotFoundException e) {
           System.out.println("ע��ʧ��");
       }
   }
   public static Connection getConnection() throws SQLException {
      //��ȡ����
       Connection connection = DriverManager.getConnection(url, user, password);
       return connection;
   }
   public static void closeResource(Connection connection, Statement stmt, ResultSet rs) {
       if (rs != null) {
           try {
               rs.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (stmt != null) {
           try {
               stmt.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       if (connection != null) {
           try {
               connection.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }

}
