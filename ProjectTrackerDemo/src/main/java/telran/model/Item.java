package telran.model;

public class Item {
    private String itemName;
    private String itemTask;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemTask() {
        return itemTask;
    }

    public void setItemTask(String itemTask) {
        this.itemTask = itemTask;
    }

    public Item(String itemName, String itemTask) {
        this.itemName = itemName;
        this.itemTask = itemTask;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemTask='" + itemTask + '\'' +
                '}';
    }
}
