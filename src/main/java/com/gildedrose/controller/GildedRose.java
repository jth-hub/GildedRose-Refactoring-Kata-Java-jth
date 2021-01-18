package com.gildedrose.controller;

import com.gildedrose.model.MyItem;
import com.gildedrose.model.enums.ItemType;
import com.gildedrose.utils.MyItemUtil;

/**
 * The Class GildedRose.
 */
public class GildedRose {
    
    /** The items. */
    public MyItem[] items;

    /**
     * Instantiates a new gilded rose.
     *
     * @param items the items
     */
    public GildedRose(MyItem[] items) {
        this.items = items;
    }

    /**
     * Update quality method which will update MyItem sellIn and Quality based on their type.
     */
    public void updateQuality() {
        for (MyItem item : items) {
        	if (!ItemType.LEGENDARY.equals(item.type)) {
        		item.sellIn--; // decrease seelIn        		
        	}
        	if (ItemType.NORMAL.equals(item.type)) {
        		MyItemUtil.decreaseQualityNormal(item);
        	} else if (ItemType.CONJURED.equals(item.type)) { 
        		MyItemUtil.decreaseQualityConjured(item);
        	} else if (ItemType.CONSUMABLE.equals(item.type)) {
        		MyItemUtil.increaseQualityConsumable(item);
        	} else if (ItemType.CONSUMABLE_WITH_EXPIRATION.equals(item.type)) {
        		MyItemUtil.increaseQualityConsumableWithExpiration(item);
        	} 
        }
    }
}