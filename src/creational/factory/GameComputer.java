package creational.factory;

public class GameComputer extends Computer {
    @Override
    public void createComputer() {
        components.add(new MemoryComponent());
        components.add(new MonitorComponent());
        components.add(new ProcessorComponent());
        components.add(new SoundCardComponent());
        components.add(new StorageDriveComponent());
        components.add(new VideoCardComponent());
    }
}
