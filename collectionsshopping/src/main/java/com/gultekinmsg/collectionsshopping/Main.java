package com.gultekinmsg.collectionsshopping;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        System.out.println("----------");

        Basket myBasket = new Basket("msg");
        sellItem(myBasket, "car", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "car", 1);
        System.out.println(myBasket);

        if (sellItem(myBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in the stock");
        }

        sellItem(myBasket, "spanner", 5);
        //    System.out.println(myBasket);

        sellItem(myBasket, "juice", 4);
        sellItem(myBasket, "cup", 12);
        sellItem(myBasket, "bread", 1);
        //    System.out.println(myBasket);

        //    System.out.println(stockList);

        Basket newBasket = new Basket("customer");
        sellItem(newBasket, "cup", 100);
        sellItem(newBasket, "juice", 5);
        removeItem(newBasket, "cup", 1);
        System.out.println(newBasket);

        removeItem(myBasket, "car", 1);
        removeItem(myBasket, "cup", 9);
        removeItem(myBasket, "car", 1);
        System.out.println("cars removed " + removeItem(myBasket, "car", 1));//should not remove
        System.out.println(myBasket);

        //remove all from myBasket
        removeItem(myBasket, "bread", 1);
        removeItem(myBasket, "cup", 3);
        removeItem(myBasket, "juice", 4);
        removeItem(myBasket, "cup", 3);
        System.out.println(myBasket);

        System.out.println("\n display stockList before and after checkout");
        System.out.println(newBasket);
        System.out.println(stockList);
        checkOut(newBasket);
        System.out.println(newBasket);
        System.out.println(stockList);


        //    temp=new StockItem("pen",1.12);
        //    stockList.Items().put(temp.getName(),temp);
        StockItem car = stockList.Items().get("car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("car").adjustStock(-1000);
        }
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

        checkOut(myBasket);
        System.out.println(myBasket);


    }


    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }


    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }


}
