public class ItemDemo {

    public static void main(String[] args) {
        // Create Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Call displayItem() on each object
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Call the static displayObjectCount() method
        Item.displayObjectCount();
    }
}

class Item {
    // Static variable to track object count
    static int objectCount = 0;

    // Instance variable for item name
    String itemName;

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment object count
    }

    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display total object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}