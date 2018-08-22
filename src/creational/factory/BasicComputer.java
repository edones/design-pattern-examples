package creational.factory;

public class BasicComputer extends Computer {
    @Override
    public void createComputer() {
        components.add(new MonitorComponent());
        components.add(new StorageDriveComponent());
        components.add(new MemoryComponent());
        components.add(new ProcessorComponent());
    }
}
