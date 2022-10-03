package exercisesCh7.technology;

public class Laptop extends Computer {
    protected double weight;  //in pounds

    public Laptop(boolean hasKeyboard, int internalStorage, int ram, double weight) {
        super(hasKeyboard, internalStorage, ram);
        this.weight = weight;
    }

    public boolean isHeavy(){
        if(weight > 4.0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", hasKeyboard=" + hasKeyboard +
                ", internalStorage=" + internalStorage +
                ", ram=" + ram +
                ", id=" + id +
                '}';
    }
}
