package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementParameterExample {
	Connection connection = null;
	String driverName = "com.mysql.cj.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost/labwork";
	String userName = "root";
	String userPass = "password";

	public PreparedStatementParameterExample() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(connectionUrl, userName, userPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) throws SQLException {
		PreparedStatementParameterExample ptmtExample = new PreparedStatementParameterExample();
		Connection con = ptmtExample.getConnection();
		ResultSet resultSet = null;
		// Writing a parameterised query in prepared Statement
		String insertQuery = "INSERT INTO student(RollNo,Name,Course,Address) VALUES(?,?,?,?)";
		try {
			// Compiling query String
			PreparedStatement statement = con.prepareStatement(insertQuery);
			// setting parameter to the query
			statement.setInt(1, 10001);
			statement.setString(2, "Jacqulin");
			statement.setString(3, "Java");
			statement.setString(4, "Lancaster");
			statement.executeUpdate();

			statement.setInt(1, 10002);
			statement.setString(2, "David");
			statement.setString(3, "Python");
			statement.setString(4, "Lancaster");
			statement.executeUpdate();

			String updateQuery = "update student set Address=? where RollNo = ?";
			PreparedStatement statement1 = con.prepareStatement(updateQuery);
			statement1.setString(1, "Tirunelveli");
			statement1.setInt(2, 10001);
			int rowsAffected = statement1.executeUpdate();
			System.out.println("Number of rows updated: " + rowsAffected);

			String deleteQuery = "delete from student where RollNo = 10002";
			PreparedStatement statement2 = con.prepareStatement(deleteQuery);
			int rowsAffected1 = statement2.executeUpdate();
			System.out.println("Number of rows deleted: " + rowsAffected1);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while (rs.next()) {
				System.out.println(rs.getString("RollNo"));
				System.out.println(rs.getString("Name"));
				System.out.println(rs.getString("Course"));
				System.out.println(rs.getString("Address"));
			}
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
