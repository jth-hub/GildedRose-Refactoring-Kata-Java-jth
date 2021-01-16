package com.gildedrose.controller;

import com.gildedrose.model.MyItem;
import com.gildedrose.model.enums.ItemType;
import com.gildedrose.utils.MyItemUtil;

public class GildedRose {
    private MyItem[] items;

    public GildedRose(MyItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (MyItem item : items) {
        	if (!ItemType.LEGENDARY.equals(item.getType())) {
        		item.sellIn--; // decrease seelIn        		
        	}
        	if (ItemType.NORMAL.equals(item.getType())) {
        		MyItemUtil.decreaseQualityNormal(item);
        	} else if (ItemType.CONJURED.equals(item.getType())) { 
        		MyItemUtil.decreaseQualityConjured(item);
        	} else if (ItemType.CONSUMABLE.equals(item.getType())) {
        		MyItemUtil.increaseQualityConsumable(item);
        	} else if (ItemType.CONSUMABLE_WITH_EXPIRATION.equals(item.getType())) {
        		MyItemUtil.increaseQualityConsumableWithExpiration(item);
        	} 
        }
    }
    
    

	public MyItem[] getItems() {
		return items;
	}

	public void setItems(MyItem[] items) {
		this.items = items;
	}
}