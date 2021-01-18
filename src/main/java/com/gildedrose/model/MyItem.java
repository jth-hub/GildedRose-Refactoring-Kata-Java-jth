package com.gildedrose.model;

import com.gildedrose.model.enums.ItemType;

/**
 * The Class MyItem.
 */
public class MyItem extends Item {
	
	/** The type. */
	public ItemType type;

	/**
	 * Instantiates a new my item.
	 *
	 * @param name the name
	 * @param sellIn the sell in
	 * @param quality the quality
	 * @param type the type
	 */
	public MyItem(String name, int sellIn, int quality, ItemType type) {
		super(name, sellIn, quality);
		this.type = type;
	}
}
