package Homework12;

public class VeggieBurger {
    public static void main(String[] args) {

    }

    String cheese = "Cheese";
    String greenery = "Greenery";

    String mayonnaise = "Mayonnaise";


    public VeggieBurger(String cheese, String greenery, String mayonnaise) {
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        String VeggieBurger = cheese + greenery + mayonnaise;
        System.out.println(VeggieBurger);
    }
}



