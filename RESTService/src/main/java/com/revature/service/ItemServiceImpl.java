package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Item;
import com.revature.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemRepository itemrepo;

	@Override
	public Item addItem(Item newItem) {
		return itemrepo.save(newItem);
	}

	@Override
	public List<Item> findAllItems() {
		return itemrepo.findAll();
	}

	@Override
	public Item findItemById(Long id) {
		return itemrepo.getOne(id);
	}

	@Override
	public Item updateItemById(Item newItem) {
		//return itemrepo.updateItemById(newItem.getItemId(), newItem);
		return itemrepo.save(newItem);
	}

	@Override
	public void deleteItem(Long id) {
		itemrepo.deleteById(id);
	}

}
