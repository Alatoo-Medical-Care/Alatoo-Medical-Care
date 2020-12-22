package sample.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String connectionString = "jdbc:mysql://"+dbHost+":"
                +dbPort+"/"+dbName;
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }
    public void signUpUser(String username, String password){
        String insert = "INSERT INTO "+Const.USERS_TABLE+"("+Const.USERS_USERNAME+","+Const.USERS_PASSWORD
                +")"+"VALUES(?, ?)";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
