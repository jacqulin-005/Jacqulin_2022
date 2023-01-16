package test;

import java.sql.*;

public class SimpleQuery {

	static String connectionUrl = "jdbc:mysql://localhost/classicmodels";
	static String userName = "root";
	static String userPass = "password";
	static Connection con = null;

	// Main driver method
	public static void main(String[] args) throws Exception {

		try {
			con = DriverManager.getConnection(connectionUrl, userName, userPass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 3: Creating statement
		Statement st = con.createStatement();

		// Step 4: Executing the query and storing the
		// result
		ResultSet rs = st.executeQuery(
				"SELECT employeeNumber, firstName, lastname, VacationHours FROM EMPLOYEES WHERE VacationHours > 20");

		// Step 5: Processing the results
		while (rs.next()) {
			System.out.println("Begin New Record");
			// FILL IN CODE HERE
			System.out.println(rs.getString("employeeNumber"));
			System.out.println(rs.getString("firstName"));
			System.out.println(rs.getString("lastname"));
			System.out.println(rs.getString("VacationHours"));
		}

		// Step 6: Closing the connections
		// using close() method to release memory resources
		con.close();

		// Display message for successful execution of program
		System.out.println("JDBC query completed");
	}
}
