package exercisesCh7.technology;

public class Computer extends AbstractEntity {
    protected boolean hasKeyboard;
    protected int internalStorage; //in gigabytes
    protected int ram; //in gigabytes

    public Computer(boolean hasKeyboard, int internalStorage, int ram) {
        super();
        this.hasKeyboard = hasKeyboard;
        this.internalStorage = internalStorage;
        this.ram = ram;
    }

    public void addRam(int num) {
        this.ram = this.ram + num;
    }

    public void addinternalStorage(int storage) {
        this.internalStorage = this.internalStorage
                + storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hasKeyboard=" + hasKeyboard +
                ", internalStorage=" + internalStorage +
                ", ram=" + ram +
                ", id=" + id +
                '}';
    }
}
