package exercisesCh7.technology;

public abstract class AbstractEntity {
    protected int idNumber;

    public int assignID() {
        this.idNumber = idNumber + 1;
        return idNumber;
    }
}
