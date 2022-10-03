package exercisesCh7.technology;

public class SmartPhone extends Computer {
    private int calls;

    public SmartPhone(boolean hasKeyboard, int internalStorage, int ram, int calls) {
        super(hasKeyboard, internalStorage, ram);
        this.calls = calls;
    }

    public void makeCalls(){
        this.calls = this.calls + 1;
    }

    public int getCalls() {return this.calls;}

    @Override
    public String toString() {
        return "SmartPhone{" +
                "calls=" + calls +
                ", hasKeyboard=" + hasKeyboard +
                ", internalStorage=" + internalStorage +
                ", ram=" + ram +
                ", id=" + id +
                '}';
    }
}
