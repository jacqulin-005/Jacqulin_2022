package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Daointerface.ConnectionDAO;
import Daointerface.ItemDAO;
import model.Item;

public class itemDAOimpl extends ConnectionDAO implements ItemDAO {

	public Item getAllItems() {
		try {
			Connection connection = ConnectionDAO.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM labwork.item");
			Item i = new Item();
			while (rs.next()) {
				i.setName(rs.getString("name"));
				i.setPrice(rs.getDouble("price"));
				System.out.println("======================");
				System.out.println(" Name :" + i.getName() + " Price: " + i.getPrice());
			}
			return i;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addItem(Item i) {
		try {
			Connection con = ConnectionDAO.getConnection();
			String sqlQuery = "INSERT INTO labwork.item (name,price) VALUES (?,?)";
			PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
			prepStmt.setString(1, i.getName());
			prepStmt.setDouble(2, i.getPrice());
			int affectedRows = prepStmt.executeUpdate();
			System.out.println(affectedRows + " row(s) affected !!");
		} catch (ClassNotFoundException e) {
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	public boolean updateItemById(Item item2, int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			PreparedStatement ps = connection
					.prepareStatement("UPDATE labwork.item SET name=?, price=? WHERE id=" + id);
			ps.setString(1, item2.getName());
			ps.setDouble(2, item2.getPrice());

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

	public boolean removeItemById(int id) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM labwork.item WHERE id=" + id);
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