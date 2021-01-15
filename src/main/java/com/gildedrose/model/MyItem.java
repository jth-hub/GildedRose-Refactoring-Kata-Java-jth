package com.gildedrose.model;

import com.gildedrose.model.enums.ItemType;

public class MyItem extends Item {
	
	private ItemType type;

	public MyItem(String name, int sellIn, int quality, ItemType type) {
		super(name, sellIn, quality);
		this.type = type;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}
}
