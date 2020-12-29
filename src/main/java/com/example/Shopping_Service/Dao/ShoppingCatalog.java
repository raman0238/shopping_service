package com.example.Shopping_Service.Dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Shopping_Service.model.ShoppingItems;
@Repository
public class ShoppingCatalog {
   private List<ShoppingItems> items=Arrays.asList(new ShoppingItems("a","b","c","d"),
		    new ShoppingItems("a","b","c","d"));

public List<ShoppingItems> getItems() {
	return items;
}

public void setItems(List<ShoppingItems> items) {
	this.items = items;
}
   
}
//checking webhook
