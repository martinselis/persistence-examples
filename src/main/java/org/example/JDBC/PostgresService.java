package org.example.JDBC;

import java.sql.*;
import java.util.Properties;

public class PostgresService {

    private String jdbcUrl = "jdbc:postgresql://localhost:5432/users";

    public PostgresService() {}

    public void connect() {
        try {
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "mysecretpassword");
            Connection conn = DriverManager.getConnection(jdbcUrl, props);
//            this.createTable(conn);
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM Users;");
            while(resultSet.next()) {
                System.out.println(resultSet);
            }
            resultSet.close();
            st.close();
        } catch (SQLException err) {
            System.out.println(err.toString());
        }
    }

    private void createTable(Connection connection) throws SQLException {
        try {
        Statement st = connection.createStatement();
//        st.executeQuery("CREATE TABLE Users (\n" +
//                "  id SERIAL PRIMARY KEY,\n" +
//                "  name VARCHAR(255),\n" +
//                "  email VARCHAR(255),\n" +
//                "  age INTEGER\n" +
//                ");");
        ResultSet set = st.executeQuery("INSERT INTO Users (name, email, age) VALUES ('John Doe', 'johndoe@example.com', 30);");
        set.close();
        st.close();
    } catch (SQLException err) {
        System.out.println(err.toString());
    }

    }
}
