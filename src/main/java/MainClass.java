public class MainClass {
    public static void main (String[] args) throws Exception {

        BirdFactory birdFactory = new BirdFactory();
        Bird parrot = birdFactory.getBird("parrot", "parrot");
        Bird crow = birdFactory.getBird("crow", "crow");
        Bird penguin = birdFactory.getBird("penguin", "penguin");
        Bird duck = birdFactory.getBird("duck", "duck");

        System.out.println("Welcome to Bird Sanctuary!!\n");

        BirdSanctuaryManager.getInstance().add(parrot);
        BirdSanctuaryManager.getInstance().add(crow);
        BirdSanctuaryManager.getInstance().add(penguin);
        BirdSanctuaryManager.getInstance().add(duck);

        BirdSanctuaryManager.getInstance().printEatable();
        BirdSanctuaryManager.getInstance().printFlyable();
        BirdSanctuaryManager.getInstance();

        System.out.println("Number of Penguins are: " + penguin.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());

        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());

        BirdSanctuaryManager.getInstance().remove(duck);
        BirdSanctuaryManager.getInstance().remove(crow);

        System.out.println("Number of Penguins are: " + penguin.getCount());
        System.out.println("Number of Ducks are: " + duck.getCount());

        System.out.println("Total Birds = " + BirdSanctuaryManager.getInstance().getAllCount());

    }
}