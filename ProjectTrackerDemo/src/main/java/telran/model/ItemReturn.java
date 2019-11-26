package telran.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemReturn {

    private String id;
    private String itemName;
    private String itemType;
    private String itemStatus;
    private String createdDate;
    private String createdBy;

    public ItemReturn() {
    }

    public ItemReturn(String id, String itemName, String itemType, String itemStatus, String createdDate, String createdBy) {
        this.id = id;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemStatus = itemStatus;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "ItemReturn{" +
                "iD='" + id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemStatus='" + itemStatus + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}
