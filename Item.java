package Pratical_NguyenThiThuy;

public class Item {
    public int itemID;
    public String name;
    public String producer;
    public double price;

    Item(int itemID, String name, String producer, double price){
        this.itemID = itemID;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public String toString(){
        return itemID+" "+name+" "+producer+" "+price;
    }
}
