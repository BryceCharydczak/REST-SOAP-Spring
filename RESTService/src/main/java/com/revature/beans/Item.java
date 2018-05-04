package com.revature.beans;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="items")
public class Item {

private static final long serialVersionUID = 1L;
    
	@Id
	@Column(name="itemId")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;
	
	@Column(name="itemName")
    private String itemName;
	
	@Column(name="price")
    private double price;
	
	@Column(name="description")
    private String description;
	
	@Column(name="sellerName")
    private String sellerName;
    
    public Item() {
        super();
    }

    public Item(String itemName, double price, String description, String sellerName) {
        super();
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.sellerName = sellerName;
    }

    public Item(Long itemId, String itemName, double price, String description, String sellerName) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.sellerName = sellerName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((sellerName == null) ? 0 : sellerName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (itemId == null) {
            if (other.itemId != null)
                return false;
        } else if (!itemId.equals(other.itemId))
            return false;
        if (itemName == null) {
            if (other.itemName != null)
                return false;
        } else if (!itemName.equals(other.itemName))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (sellerName == null) {
            if (other.sellerName != null)
                return false;
        } else if (!sellerName.equals(other.sellerName))
            return false;
        return true;
    }
	
	
}
