package Runner;

import Controller.itemDAOimpl;
import Daointerface.ItemDAO;
import model.Item;

public class AccessItem {

	public static void main(String[] args) {

		// Insert
		ItemDAO itemDao = new itemDAOimpl();
		System.out.println("--------- inserting item records ----------");

		Item i1 = new Item();
		i1.setName("Tv");
		i1.setPrice(299.99);
		itemDao.addItem(i1);

		Item i2 = new Item();
		i2.setName("Laptop");
		i2.setPrice(799.99);
		itemDao.addItem(i2);

		Item i3 = new Item();
		i3.setName("Mac");
		i3.setPrice(2999.99);
		itemDao.addItem(i3);

		Item i4 = new Item();
		i4.setName("Playstation");
		i4.setPrice(499.99);
		itemDao.addItem(i4);

		Item i5 = new Item();
		i5.setName("iPhone");
		i5.setPrice(1399.99);
		itemDao.addItem(i5);

		// Retrieve
		System.out.println(" ====== Display list of all items ====");
		itemDao.getAllItems();

		// Update
		System.out.println("======================");
		System.out.println("---- Updating item information -----");

		Item itemupdate = new Item();
		itemupdate.setName("Dishwasher");
		itemupdate.setPrice(999.99);
		boolean u = itemDao.updateItemById(itemupdate, 3);

		if (u == true) {
			System.out.println("Record is updated");
			System.out.println("Name :" + itemupdate.getName() + " Price: " + itemupdate.getPrice());
			System.out.println("======================");
		} else {
			System.out.println("Record is not updated");
			System.out.println("======================");
		}

		// Delete
		System.out.println("---- Deleting item information -----");
		boolean d = itemDao.removeItemById(4);
		if (d == true) {
			System.out.println("Record is deleted");
			System.out.println("======================");
		} else {
			System.out.println("Record is not deleted");
			System.out.println("======================");
		}

	}

}
