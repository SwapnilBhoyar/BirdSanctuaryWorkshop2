public class BirdFactory {
    public Bird getBird(String birds, String nameOfBird) {

        switch (birds) {
            case "parrot":
                return new Parrot(nameOfBird);
            case "crow":
                return new Crow(nameOfBird);
            case "penguin":
                return new Penguin(nameOfBird);
            case "duck":
                return new Duck(nameOfBird);
            default:
                return null;
        }
    }
}
