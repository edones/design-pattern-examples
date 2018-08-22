package creational.singleton;

public class ResourceSingleton {
    private static volatile ResourceSingleton instance = new ResourceSingleton();

    private ResourceSingleton() {
        if(instance != null) {
            throw new RuntimeException("Use getInstance method to create");
        }
    }

    public static ResourceSingleton getInstance() {
        //double check locking mechanism & synchronize check
        if(instance == null) {
            synchronized (ResourceSingleton.class) {
                if(instance == null) {
                    instance = new ResourceSingleton();
                }
            }
        }

        return instance;
    }


}
