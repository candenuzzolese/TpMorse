package CodigoMorse;

import org.junit.Test;

public class MorseCodeTest {

    @Test
   public void test001 (){

        MorseCode morse = new MorseCode ();

        morse.charactersToHashmap ();
        morse.stringToMorse ( "candela");


    }

    @Test
    public void test002(){


       MorseCode morse = new MorseCode ();

       morse.charactersToHashmap ();
       morse.reverseHashmap ();


    }

}
