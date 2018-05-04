package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.beans.Item;
import com.revature.service.ItemService;

@CrossOrigin
@RestController
@RequestMapping("/items")
public class ItemController {

	
	@Autowired
	ItemService itemservice;
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Item addItem(@RequestBody Item newItem) {
		return itemservice.addItem(newItem);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Item> findAllItems(){
		return itemservice.findAllItems();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Item findItemById(@PathVariable("id") Long id) {
		return itemservice.findItemById(id);
	}
	
	@PutMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Item updateItemById(@RequestBody Item newItem) {
		return itemservice.updateItemById(newItem);
	}
	
	@DeleteMapping(value="/delete/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteItem(@PathVariable("id") Long id) {
		itemservice.deleteItem(id);
	}
	
}
