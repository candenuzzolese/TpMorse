package CodigoMorse;

import java.util.HashMap;

public class MorseCode {

    //candela
    //sadfa

    //sdfafasfas..
    //DAS
    HashMap<Character,String> charactersMorseCode = new HashMap<> (  );
    HashMap<Integer,String> numbersMorse = new HashMap<> (  );
    HashMap<String, Character> reversedCharacters = new HashMap<> (  );



    public void charactersToHashmap() {

        charactersMorseCode.put ( 'a', ".-" );
        charactersMorseCode.put ( 'b', "-..." );
        charactersMorseCode.put ( 'c', "-.-." );
        //charactersMorseCode.put('ch',"----");
        charactersMorseCode.put ( 'd', "-.." );
        charactersMorseCode.put ( 'e', "." );
        charactersMorseCode.put ( 'f', "..-." );
        charactersMorseCode.put ( 'g', "--." );
        charactersMorseCode.put ( 'h', "...." );
        charactersMorseCode.put ( 'i', "" );
        charactersMorseCode.put ( 'j', ".---" );
        charactersMorseCode.put ( 'k', "-.-" );
        charactersMorseCode.put ( 'l', ".-.." );
        charactersMorseCode.put ( 'm', "--" );
        charactersMorseCode.put ( 'n', ".-" );
        charactersMorseCode.put ( 'ñ', "--.--" );
        charactersMorseCode.put ( 'o', "---" );
        charactersMorseCode.put ( 'p', ".--." );
        charactersMorseCode.put ( 'q', "--.-" );
        charactersMorseCode.put ( 'r', ".-." );
        charactersMorseCode.put ( 's', "..." );
        charactersMorseCode.put ( 't', "-" );
        charactersMorseCode.put ( 'u', "..-" );
        charactersMorseCode.put ( 'v', "...-" );
        charactersMorseCode.put ( 'w', ".--" );
        charactersMorseCode.put ( 'x', "-..-" );
        charactersMorseCode.put ( 'y', "-.--" );
        charactersMorseCode.put ( 'z', "--.." );
        charactersMorseCode.put ( ' ', "" );
        charactersMorseCode.put( '.',".-.-.-" );
        charactersMorseCode.put( ',',"--..--" );
        charactersMorseCode.put ( '?',"..--.." );
        charactersMorseCode.put ( '"',".-..-." );

    }

    public void numbersToHash(){
        numbersMorse.put ( 0,"-----" );
        numbersMorse.put ( 1,".----" );
        numbersMorse.put ( 2,"..---" );
        numbersMorse.put ( 3,"...--" );
        numbersMorse.put ( 4,"....-" );
        numbersMorse.put ( 5,"....." );
        numbersMorse.put ( 6,"-...." );
        numbersMorse.put( 7,"--..." );
        numbersMorse.put ( 8,"---.." );
        numbersMorse.put( 9,"----." );

    }


    void stringToMorse(String string){


        String stringMorse ="";

        String theChar="";

        //recorre mi texto
        for (int n = 0; n<string.length (); n++){


            if (charactersMorseCode.containsKey ( string.charAt ( n ) )){

                    stringMorse += ( charactersMorseCode.get ( string.charAt ( n ) ) );

                }


            }

                System.out.println ("text to morse is: " + stringMorse);

            }



    public void reverseHashmap(){

        for (char i: charactersMorseCode.keySet ()) {

            reversedCharacters.put ( charactersMorseCode.get ( i ),i );

        }
    }
        //key String object Character

    public void morseToString(String i){

        String hola= "";

        for (int j = 0; j < reversedCharacters.size () ; j++) {

            //if (i == reversedCharacters.get (  ))


        }

    }



}



