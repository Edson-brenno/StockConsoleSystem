package Model;

// Product Model; Model Do produto
public class ProductModel {
    private String name, description;
    private double price;
    private int quantity;

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String toString(){
        return "Name: " + this.name + " Price: " + this.price;
    }
}
