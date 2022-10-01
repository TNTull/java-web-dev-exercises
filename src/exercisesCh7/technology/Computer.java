package exercisesCh7.technology;

public class Computer extends AbstractEntity {
    protected boolean hasKeyboard;
    private int internalStorage; //in gigabytes
    private int ram; //in gigabytes

    public Computer(boolean hasKeyboard, int internalStorage, int ram) {
        super();
        this.hasKeyboard = hasKeyboard;
        this.internalStorage = internalStorage;
        this.ram = ram;
    }

    public void addRam(int num) {
        this.ram = this.ram + num;
    }

    public void internalStorage(int storage) {
        this.internalStorage = this.internalStorage
                + storage;
    }
}
