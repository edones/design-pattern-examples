package behavioral.template;

public class PorkAdoboCooking extends CookingTemplate{
    @Override
    void getIngredients() {
        System.out.println("Get pork");
        System.out.println("Get laurel");
        System.out.println("Get pepper");
        System.out.println("Get soysauce");
        System.out.println("Get vinegar");
        System.out.println("Get sugar");
        System.out.println("Get garlic");
    }

    @Override
    void doPreparation() {
        System.out.println("Cut the pork");
    }

    @Override
    void doCook() {
        System.out.println("Put in the pork");
        System.out.println("Put in the chicken");
        System.out.println("Put the rest of ingredients in");
    }

    @Override
    void doPostCooking() {
        System.out.println("Let it simmer");
    }
}
