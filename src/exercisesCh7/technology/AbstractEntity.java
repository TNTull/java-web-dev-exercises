package exercisesCh7.technology;

public abstract class AbstractEntity {
    protected int id;
    protected static int nextId = 1;


    public AbstractEntity() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
