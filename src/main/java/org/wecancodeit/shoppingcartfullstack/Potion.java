package org.wecancodeit.shoppingcartfullstack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Potion {
	

	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public Potion(String itemName) {
		this.itemName = itemName;
		// TODO Auto-generated constructor stub
	}
	
	public Potion() {}  
	
}
