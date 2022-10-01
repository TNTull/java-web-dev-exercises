package exercisesCh7.technology;

public class SmartPhone extends Computer {
    private int calls;

    public SmartPhone(boolean haskeyboard, int hardDrive, int ram, int calls) {
        super(haskeyboard, hardDrive, ram);
        this.calls = calls;
    }

    public void makeCalls(){
        this.calls = this.calls + 1;
    }

    public int getCalls() {return this.calls;}
}
