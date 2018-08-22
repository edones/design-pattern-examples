package creational.singleton;

public class ResourceSingletonDemo {
    public static void main(String[] args) {
        ResourceSingleton resourceAlpha = ResourceSingleton.getInstance();
        ResourceSingleton resourceBeta = ResourceSingleton.getInstance();

        System.out.println(resourceAlpha);
        System.out.println(resourceBeta);
    }
}
