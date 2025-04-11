package org.example.others;

import java.util.Scanner;

public class FactoryPatterm {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());


        System.out.println("The factory returned class "+food.getClass().getName());
        System.out.println(food.getType());
    }

}

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        return order.equals("cake") ? new Cake() : new Pizza();
    }

}