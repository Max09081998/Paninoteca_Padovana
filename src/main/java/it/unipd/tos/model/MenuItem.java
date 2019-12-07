////////////////////////////////////////////////////////////////////
// [MASSIMO] [TOFFOLETTO] [1161727]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {
    private ItemType itemType;
    private String name;
    private Double price;

    public MenuItem(ItemType itemType, String name, Double price) {
        super();
        this.itemType = itemType;
        this.name = name;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
}