package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Daointerface.ConnectionDAO;
import Daointerface.CustomerDAO;
import model.Customer;

public class CustomerDAOimpl extends ConnectionDAO implements CustomerDAO {
	public Customer getCustomerById(int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM labwork.customer where id =" + id);
			Customer c = new Customer();
			while (rs.next()) {
				c.setEmail(rs.getString("email"));
				c.setFname(rs.getString("fname"));
				c.setLname(rs.getString("lname"));
			}
			return c;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addCustomer(Customer c) {
		try {
			Connection con = ConnectionDAO.getConnection();
			String sqlQuery = "INSERT INTO labwork.customer (email,fname,lname) VALUES (?,?,?)";
			PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setString(1, c.getEmail());
			prepStmt.setString(2, c.getFname());
			prepStmt.setString(3, c.getLname());
			int affectedRows = prepStmt.executeUpdate();
			System.out.println(affectedRows + " row(s) affected !!");
		} catch (ClassNotFoundException e) {
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public boolean updateCustomerById(Customer cust2, int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("UPDATE labwork.customer SET email=?, fname=?, lname=? WHERE id=" + id);
			ps.setString(1, cust2.getEmail());
			ps.setString(2, cust2.getFname());
			ps.setString(3, cust2.getLname());
			// ps.setInt(4, id);

			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		return false;
	}

	public boolean removeCustomerById(int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM labwork.customer WHERE id=" + id);
			// ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException ex) {
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		}
		return false;
	}

}
