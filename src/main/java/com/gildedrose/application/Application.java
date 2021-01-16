package com.gildedrose.application;

import com.gildedrose.controller.GildedRose;
import com.gildedrose.model.Item;
import com.gildedrose.model.MyItem;
import com.gildedrose.model.enums.ItemType;

public class Application {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");
        MyItem[] items = new MyItem[] {
                new MyItem("+5 Dexterity Vest", 10, 20, ItemType.NORMAL), //
                new MyItem("Aged Brie", 2, 0, ItemType.CONSUMABLE), //
                new MyItem("Elixir of the Mongoose", 5, 7, ItemType.NORMAL), //
                new MyItem("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.LEGENDARY), //
                new MyItem("Sulfuras, Hand of Ragnaros", -1, 80, ItemType.LEGENDARY),
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.CONSUMABLE_WITH_EXPIRATION),
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 10, 49, ItemType.CONSUMABLE_WITH_EXPIRATION),
                new MyItem("Backstage passes to a TAFKAL80ETC concert", 5, 49, ItemType.CONSUMABLE_WITH_EXPIRATION),
                // this conjured item does not work properly yet
                new MyItem("Conjured Mana Cake", 3, 6, ItemType.CONJURED) };

        GildedRose app = new GildedRose(items);

        int days = 150;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
        	app.updateQuality();
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
        }
    }

}
