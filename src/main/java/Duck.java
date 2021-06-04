public class Duck extends Bird implements swimable,flyable{
    static int count = 0;

    public Duck(String id) {
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
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