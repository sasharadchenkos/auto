import com.auto.Enemy;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by orad on 19.09.2016.
 */
public class EnemyTest {

    static int maxStrength = 30;
    static int maxPower = 30;
    Enemy enemy = new Enemy(maxStrength,maxPower);

    @Test
    public void testForStrength() {

        int strength = enemy.getStrength();
        Assert.assertTrue(strength >= 0);
        Assert.assertTrue(strength < maxStrength);
    }



    @Test
    public void testForPower() {

        int power = enemy.getPower();
        Assert.assertTrue(power >= 0);
        Assert.assertTrue(power < maxPower);
    }

}
