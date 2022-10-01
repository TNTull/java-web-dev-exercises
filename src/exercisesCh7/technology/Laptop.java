package exercisesCh7.technology;

public class Laptop extends Computer {
    protected double weight;  //in pounds

    public Laptop(boolean haskeyboard, int hardDrive, int ram, double weight) {
        super(haskeyboard, hardDrive, ram);
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
}
