package com.gildedrose.model;

/**
 * The Class Item.
 */
public class Item {

    /** The name. */
    public String name;

    /** The sell in. */
    public int sellIn;

    /** The quality. */
    public int quality;

    /**
     * Instantiates a new item.
     *
     * @param name the name
     * @param sellIn the sell in
     * @param quality the quality
     */
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   /**
    * To string.
    *
    * @return the string
    */
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
