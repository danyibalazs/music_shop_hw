package shop;

import behaviour.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }
}
