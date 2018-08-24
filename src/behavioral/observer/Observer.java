package behavioral.observer;

public abstract class Observer {
    //reference to the subject that we can get info from
    protected Subject subject;

    //observer contract
    abstract void update();
}
