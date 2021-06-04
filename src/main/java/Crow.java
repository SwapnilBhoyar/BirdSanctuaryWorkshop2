public class Crow extends Bird implements flyable{
    static int count = 0;

    public Crow(String id) {
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void decrementCount() {
        count--;
    }
}
