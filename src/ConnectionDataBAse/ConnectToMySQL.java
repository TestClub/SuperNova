package ConnectionDataBAse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectToMySQL {

    public static  Connection connect = null;
    public static  Statement statement  = null;
    public static  PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectMySQL() throws IOException, SQLException, ClassNotFoundException{
        Properties prop = loadProperties();
        String DriverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String user = prop.getProperty("MYSQLJDBC.user");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(DriverClass);
        connect = DriverManager.getConnection(url,user,password);
        System.out.println("Database is connected");
        return connect;
    }


    public static void main(String[] args) {
        try {
            Connection mycon = connectMySQL();

            Statement st = mycon.createStatement();

            ResultSet rs = st.executeQuery("Select * From PNT");

            while (rs.next()){
                System.out.println("ID => "+ rs.getString("studentID")+ " "+ rs.getString("studentName")+ " "+
                rs.getString("studentDOB"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
