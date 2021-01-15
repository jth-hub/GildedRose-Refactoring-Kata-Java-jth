package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
    
    @Test
    void updateQuality_1Days_dexterityVest() {
    	Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20)
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
    	Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
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
    	Item[] items = new Item[] {
                new Item("Elixir of the Mongoose", 5, 7)
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
    	Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
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
    	Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
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
    	Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 3, 6)
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
    	Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20)
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
    	Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
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
    	Item[] items = new Item[] {
                new Item("Elixir of the Mongoose", 5, 7)
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
    	Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
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
    	Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
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
    	Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 3, 6)
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
    	Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20)
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
    	Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
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
    	Item[] items = new Item[] {
                new Item("Elixir of the Mongoose", 5, 7)
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
    	Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
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
    	Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
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
    	Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 3, 6)
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
    	Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20)
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
    	Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
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
    	Item[] items = new Item[] {
                new Item("Elixir of the Mongoose", 5, 7)
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
    	Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
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
    	Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
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
    	Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 3, 6)
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
    	Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
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
    	Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
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
