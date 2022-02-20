package shop;

import shop.stockItems.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    public String addStock(ISell item){
        if(this.stock.add(item)) return "Item added successfully!";
        return "Item could not be added!";
    }

    public boolean findStock(ISell item){
        return this.stock.contains(item);
    }

    public String removeStock(ISell item){
        if(findStock(item)){
            this.stock.remove(item);
            return "Item removed successfully";
        }
        return "Item not found in stock";
    }

    public double calculateTotalMarkup(){
        return this.stock.stream().map(ISell::calculateMarkup).reduce(0.0, Double::sum);
    }

}
