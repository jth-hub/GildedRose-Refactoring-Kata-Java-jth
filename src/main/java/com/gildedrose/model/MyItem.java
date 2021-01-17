package com.gildedrose.model;

import com.gildedrose.model.enums.ItemType;

public class MyItem extends Item {
	
	public ItemType type;

	public MyItem(String name, int sellIn, int quality, ItemType type) {
		super(name, sellIn, quality);
		this.type = type;
	}
}
