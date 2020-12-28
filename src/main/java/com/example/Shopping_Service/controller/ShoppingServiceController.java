package com.example.Shopping_Service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shopping_Service.Dao.ShoppingCatalog;
import com.example.Shopping_Service.model.ShoppingItems;

@RestController
public class ShoppingServiceController {
 
	@Autowired
	private ShoppingCatalog shoppingCatalog;
	
	@GetMapping("/getAllItems")
	public List<ShoppingItems> getListOfItems(){
		return shoppingCatalog.getItems();
	}
}
