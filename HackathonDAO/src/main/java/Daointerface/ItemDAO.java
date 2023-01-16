package Daointerface;

import model.Item;

public interface ItemDAO {

	Item getAllItems();

	void addItem(Item i);

	boolean updateItemById(Item item, int id);

	boolean removeItemById(int id);

}
