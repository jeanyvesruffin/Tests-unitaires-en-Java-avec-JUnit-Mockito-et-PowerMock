package formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Calculatrice2Test {

    int a;
    int b;
    int resultatAttendu;

    public Calculatrice2Test(int a, int b, int resultatAttendu) {
        this.a = a;
        this.b = b;
        this.resultatAttendu = resultatAttendu;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {1,2,3},
            {5,3,8},
            {10,20,30}
        });
    }

    @Test 
    public void testAddition(){
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(resultatAttendu,calculatrice.addition(a, b));
        
    }

}
