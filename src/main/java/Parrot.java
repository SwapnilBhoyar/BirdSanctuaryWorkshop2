public class Parrot extends Bird implements flyable{

    public Parrot(String id) {
        this.id = id;
    }

    static int count = 0;
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
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