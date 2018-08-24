package behavioral.template;

public abstract class CookingTemplate {
    abstract void getIngredients();
    abstract void doPreparation();
    abstract void doCook();
    abstract void doPostCooking();

    protected final void taste() {
        //some logic can be fixed and aren't implemented in child classes
        System.out.println("Get spoon and take a simple taste");
    }

    public final void start() {
        getIngredients();
        doPreparation();
        doCook();
        doPostCooking();
        taste();
    }
}
