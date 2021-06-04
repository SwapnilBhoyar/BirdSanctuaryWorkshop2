import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {
    Set<Bird> birdList = new HashSet<>();

    Set<flyable> flyableBirds = new HashSet<>();

    private static BirdSanctuaryManager instance;

    public static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {
    }

    public void add(Bird bird) {

        try {
            if (bird == null) {
                throw new BirdSanctuaryException("null not allowed");
            } else {
                birdList.add(bird);
            }
        }
        catch (BirdSanctuaryException e) {
            e.printStackTrace();
        }
        bird.incrementCount();
    }

    public void remove(Bird bird) throws BirdSanctuaryException {
        if(birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        } else {
            throw new BirdSanctuaryException("Did not find bird!!");
        }
    }

    public int getAllCount() {
        return birdList.size();
    }

    /*public void print() {
        for(Bird bird: birdList) {
            bird.eat();
            if(bird instanceof flyable) {
                ((flyable)bird).fly();
            }
            if(bird instanceof swimable) {
                swimable swimmable = (swimable)bird;
                swimmable.swim();
            }
        }
    }*/

    public void printSwimable() {
        birdList.stream().filter(S->S instanceof swimable).forEach(S->((swimable)S).swim());
        /*for (swimable bird: swimableBirds) {
            bird.swim();
        }*/
    }

    public void printFlyable() {
        birdList.stream().filter(bird->bird instanceof flyable).forEach(bird->((flyable)bird).fly());
        /*flyableBirds = (birdList.stream().filter(S->S instanceof flyable).map(S->(flyable)S).collect(Collectors.toSet()));
        for (flyable bird: flyableBirds) {
            bird.fly();
        }*/
    }

    public void printEatable() {
//        birdList.stream().forEach(bird->bird.eat());
            birdList.stream().forEach(Bird::eat);
    }
}