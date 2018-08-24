package behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {
        //1. create template with hooks & methods
        //2. create concrete classes

        CookingTemplate cooking = new PorkAdoboCooking();
        cooking.start();

        //can swap cooking with another implementation. logic is in concrete class
        cooking = new FriedChickenCooking();
        cooking.start();
    }
}
