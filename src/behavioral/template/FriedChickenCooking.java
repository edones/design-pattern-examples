package behavioral.template;

public class FriedChickenCooking extends CookingTemplate{
    @Override
    void getIngredients() {
        System.out.println("Get chicken");
        System.out.println("Get breading");
        System.out.println("Get garlic");
    }

    @Override
    void doPreparation() {
        System.out.println("Cut the chicken");
    }

    @Override
    void doCook() {
        System.out.println("Put in the garlic");
        System.out.println("Put in the chicken");
    }

    @Override
    void doPostCooking() {
        System.out.println("Fry it");
    }
}
