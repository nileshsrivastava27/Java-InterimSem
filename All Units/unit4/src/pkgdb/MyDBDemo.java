package pkgdb;



import java.sql.SQLException;

import java.sql.*;





public class MyDBDemo {

    public static void main(String[] args) throws SQLException{

        try{

//1 Load the driver class

//Class.forName("jdbc.odbc.JdbcOdbcDriver");

//2 Use driver manager to get a connection to DB

            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/erpdb","root","");



//3 Use connection to create a statement

            Statement st = (Statement) con.createStatement();

//4 Use statement to execute query to get a result set

            String query = "select * from customers where id=1";

            ResultSet rs = st.executeQuery(query);

//5 Use result set to read the records

            while(rs.next()){

                System.out.println(rs.getString("id"));

                System.out.println(rs.getString("name"));

                System.out.println(rs.getString("favourite"));

            }

        }catch(Exception e){

            e.printStackTrace();

        }//catch(SQLException e){}

    }

}