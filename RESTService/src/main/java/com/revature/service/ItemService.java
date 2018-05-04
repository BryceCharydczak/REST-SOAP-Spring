package com.revature.service;

import java.util.List;

import com.revature.beans.Item;

public interface ItemService {
	
	public Item addItem(Item newItem);
	public List<Item> findAllItems();
	public Item findItemById(Long id);
	public Item updateItemById(Item newItem);
	public void deleteItem(Long id);
	

}
