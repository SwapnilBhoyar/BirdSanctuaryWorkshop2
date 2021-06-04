import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdSanctuaryManagerTest
{
//

    void givenBirds_WhenProper_ReturnsTotalCountOfBirds() {

        BirdFactory birdFactory = new BirdFactory();
        Bird parrot = birdFactory.getBird("parrot", "parrot");
        Bird crow = birdFactory.getBird("crow", "crow");
        Bird penguin = birdFactory.getBird("penguin", "penguin");
        Bird duck = birdFactory.getBird("duck", "duck");

        BirdSanctuaryManager.getInstance().add(parrot);
        BirdSanctuaryManager.getInstance().add(crow);
        BirdSanctuaryManager.getInstance().add(penguin);
        BirdSanctuaryManager.getInstance().add(duck);

        int result = BirdSanctuaryManager.getInstance().getAllCount();
        Assertions.assertEquals(4, result);
    }

    @Test
    void givenValueNull_ShouldThrowCustomException() {

        BirdSanctuaryManager.getInstance().add(null);
        int result = BirdSanctuaryManager.getInstance().getAllCount();
        Assertions.assertEquals( 0, result);
    }

    @Test
    void givenValue_ShouldThrowCustomException() {
        Parrot parrot1 = new Parrot("p1");
        Assertions.assertThrows( BirdSanctuaryException.class,  () -> {BirdSanctuaryManager.getInstance().remove(parrot1);});
    }
}