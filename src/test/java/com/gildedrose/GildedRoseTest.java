package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gildedrose.controller.GildedRose;
import com.gildedrose.model.MyItem;
import com.gildedrose.model.enums.ItemType;

class GildedRoseTest {

    @Test
    void foo() {
        MyItem[] items = new MyItem[] { new MyItem("foo", 0, 0, ItemType.NORMAL) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].name);
    }
    
    @Test
    void updateQuality_1Days_dexterityVest() {
		MyItem[] items = new MyItem[] {
                new MyItem("+5 Dexterity Vest", 10, 20, ItemType.NORMAL)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("+5 Dexterity Vest", items[0].name);
    	assertEquals(9, items[0].sellIn);
    	assertEquals(19, items[0].quality);
    }
    
    @Test
    void updateQuality_1Days_agedBrie() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Aged Brie", items[0].name);
    	assertEquals(1, items[0].sellIn);
    	assertEquals(1, items[0].quality);
    }
    
    @Test
    void updateQuality_1Days_elixirOfTheMongoose() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Elixir of the Mongoose", 5, 7, ItemType.NORMAL)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Elixir of the Mongoose", items[0].name);
    	assertEquals(4, items[0].sellIn);
    	assertEquals(6, items[0].quality);
    }
    
    @Test
    void updateQuality_1Days_sulfurasHandOfRagnaros() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.LEGENDARY)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(80, items[0].quality);
    }
    
    @Test
    void updateQuality_1Days_backstagePassesToATAFKAL80ETCConcert() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    	assertEquals(14, items[0].sellIn);
    	assertEquals(21, items[0].quality);
    }
    
    @Test
    void updateQuality_1Days_conjuredManaCake() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Conjured Mana Cake", 3, 6, ItemType.CONJURED)
    	};
    	int days = 1;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Conjured Mana Cake", items[0].name);
    	assertEquals(2, items[0].sellIn);
    	assertEquals(5, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_dexterityVest() {
    	MyItem[] items = new MyItem[] {
                new MyItem("+5 Dexterity Vest", 10, 20, ItemType.NORMAL)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("+5 Dexterity Vest", items[0].name);
    	assertEquals(5, items[0].sellIn);
    	assertEquals(15, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_agedBrie() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Aged Brie", items[0].name);
    	assertEquals(-3, items[0].sellIn);
    	assertEquals(8, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_elixirOfTheMongoose() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Elixir of the Mongoose", 5, 7, ItemType.NORMAL)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Elixir of the Mongoose", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(2, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_sulfurasHandOfRagnaros() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.LEGENDARY)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(80, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_backstagePassesToATAFKAL80ETCConcert() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    	assertEquals(10, items[0].sellIn);
    	assertEquals(25, items[0].quality);
    }
    
    @Test
    void updateQuality_5Days_conjuredManaCake() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Conjured Mana Cake", 3, 6, ItemType.CONJURED)
    	};
    	int days = 5;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Conjured Mana Cake", items[0].name);
    	assertEquals(-2, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_dexterityVest() {
    	MyItem[] items = new MyItem[] {
                new MyItem("+5 Dexterity Vest", 10, 20, ItemType.NORMAL)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("+5 Dexterity Vest", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(10, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_agedBrie() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Aged Brie", items[0].name);
    	assertEquals(-8, items[0].sellIn);
    	assertEquals(18, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_elixirOfTheMongoose() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Elixir of the Mongoose", 5, 7, ItemType.NORMAL)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Elixir of the Mongoose", items[0].name);
    	assertEquals(-5, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_sulfurasHandOfRagnaros() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.LEGENDARY)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(80, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_backstagePassesToATAFKAL80ETCConcert() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    	assertEquals(5, items[0].sellIn);
    	assertEquals(35, items[0].quality);
    }
    
    @Test
    void updateQuality_10Days_conjuredManaCake() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Conjured Mana Cake", 3, 6, ItemType.CONJURED)
    	};
    	int days = 10;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Conjured Mana Cake", items[0].name);
    	assertEquals(-7, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_15Days_dexterityVest() {
    	MyItem[] items = new MyItem[] {
                new MyItem("+5 Dexterity Vest", 10, 20, ItemType.NORMAL)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("+5 Dexterity Vest", items[0].name);
    	assertEquals(-5, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_12Days_agedBrie() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Aged Brie", items[0].name);
    	assertEquals(-13, items[0].sellIn);
    	assertEquals(28, items[0].quality);
    }
        
    @Test
    void updateQuality_15Days_elixirOfTheMongoose() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Elixir of the Mongoose", 5, 7, ItemType.NORMAL)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Elixir of the Mongoose", items[0].name);
    	assertEquals(-10, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_15Days_sulfurasHandOfRagnaros() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.LEGENDARY)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(80, items[0].quality);
    }
    
    @Test
    void updateQuality_15Days_backstagePassesToATAFKAL80ETCConcert() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    	assertEquals(0, items[0].sellIn);
    	assertEquals(50, items[0].quality);
    }
        
    @Test
    void updateQuality_15Days_conjuredManaCake() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Conjured Mana Cake", 3, 6, ItemType.CONJURED)
    	};
    	int days = 15;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Conjured Mana Cake", items[0].name);
    	assertEquals(-12, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_16Days_backstagePassesToATAFKAL80ETCConcert() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION)
    	};
    	int days = 16;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    	assertEquals(-1, items[0].sellIn);
    	assertEquals(0, items[0].quality);
    }
    
    @Test
    void updateQuality_45Days_agedBrie() {
    	MyItem[] items = new MyItem[] {
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE)
    	};
    	int days = 45;
    	GildedRose app = new GildedRose(items);
    	for (int i = 0; i < days; i++) {
    		app.updateQuality();
    	}
    	assertEquals("Aged Brie", items[0].name);
    	assertEquals(-43, items[0].sellIn);
    	assertEquals(50, items[0].quality);
    }
}
