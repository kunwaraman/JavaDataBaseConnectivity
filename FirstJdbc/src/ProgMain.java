import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProgMain {
    public static void main(String[] args) {
        try{
            String drivername="com.mysql.cj.jdbc.Driver";
            Class.forName(drivername);
            String url="jdbc:mysql://localhost:3306/world";
            // chosee the data base password and usernmae
            Connection conn = DriverManager.getConnection(url,username,pswd);

            Statement st = conn.createStatement();
            String sql = "select * from city";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                int id=rs.getInt(1);
                String Cname=rs.getString(2);
                String Ccode = rs.getString(3);
                String distct= rs.getString(4);
                int popu = rs.getInt(5);

                System.out.println(id+" " +Cname+" " +Ccode+" "+distct+" " +popu);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
