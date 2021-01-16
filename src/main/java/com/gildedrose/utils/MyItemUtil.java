package com.gildedrose.utils;

import com.gildedrose.model.MyItem;

public class MyItemUtil {
	
	public static void decreaseQualityNormal(MyItem item) {
    	decreaseQuality(item);
		if (item.sellIn < 0) {
			decreaseQuality(item);
		}
    }
    
    public static void increaseQualityConsumable(MyItem item) {
    	if (item.quality < 50 && item.sellIn >= 0) {
    		item.quality++;
		} else if (item.quality < 50 && item.sellIn < 0) {
			item.quality ++;
			if (item.quality < 50) {
				item.quality++;
			}
		}
    }
    
    public static void increaseQualityConsumableWithExpiration(MyItem item) {
    	if (item.sellIn >= 0) {
    		if (item.quality < 50) {
        		item.quality++;
    	    	if (item.sellIn < 10 && item.quality < 50) {
    	    		item.quality++;
    	        }
    	
    	        if (item.sellIn < 5 && item.quality < 50) {
    	        	item.quality++;
    	        }
        	}
		} else {
			item.quality = 0;
		}
    }
    
    private static void decreaseQuality(MyItem item) {
    	if (item.quality > 0) {
    		item.quality--;
    	}
    }
}
