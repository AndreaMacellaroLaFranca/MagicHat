package magic.hat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicHat {

    static String[] studentsName = new String[]{"Mirko Risuleo", "Karen Russo", "Salvatore Tavella", "Alessia Pallavera", "Pierluigi Micozzi", "Eleonora Siciliano", "Gianluca Pricopie", "Miryam Massa", "Pamela Milanese", "Ejran Mustafoski", "Andrea Macellaro La Franca", "Alessandro Massa", "Pietro Marinari", "Alessandro Stelitano", "Stefano Puro", "Lucrezia Lauri", "Mario Peccio", "Lorenzo Masci", "Danilo Vulpiani", "Carlotta Pisano", "Ilies Chikhaoui", "Samuele Celletti", "Gabriele Sabatini", "Joshua Castellani", "Macali Roberto", "Lorenzo Salvatori", "Marco Falconetti", "Luca Galimberti", "Matteo Fratti"};
    static int numHouses = 4;
    static int houseSize = studentsName.length/numHouses;

    public static void main(String[] Args){

        //RANDOMIZER ARRAY STUDENTI
        List<String> StringList = Arrays.asList(studentsName);
        Collections.shuffle(StringList);
        StringList.toArray(studentsName);

        //FORMATTAZIONE E STAMPA
        System.out.printf("%50s %n","HUFFLEPUFF");
        System.out.println(Arrays.toString(createHufflePuff()));
        System.out.println("\n");

        System.out.printf("%50s %n","RAVENCLAW");
        System.out.println(Arrays.toString(createRavenClaw()));
        System.out.println("\n");

        System.out.printf("%50s %n","SLYTHERIN");
        System.out.println(Arrays.toString(createSlytherin()));
        System.out.println("\n");

        System.out.printf("%50s %n","GRYFFINDOR");
        System.out.println(Arrays.toString(createGryffindor()));

    }

    public static String[] createHufflePuff(){

        String[] hufflePuff = new String[7];

        for (int i = 0; i<houseSize; i++) {
                hufflePuff[i] = studentsName[i];
        }
        return hufflePuff;
    }

    public static String[] createRavenClaw(){

        String[] ravenClaw = new String[7];

        for (int i = houseSize; i<2*houseSize; i++) {
                ravenClaw[i-houseSize] = studentsName[i];
        }
        return ravenClaw;
    }

    public static String[] createSlytherin(){

        String[] slytherin = new String[7];

        for (int i = 2*houseSize; i<3*houseSize; i++) {
                slytherin[i-houseSize*2] = studentsName[i];
        }
        return slytherin;
    }

    public static String[] createGryffindor(){

        String[] gryffindor = new String[8];

        for (int i = 3*houseSize; i<4*houseSize+1; i++) {
                gryffindor[i-houseSize*3] = studentsName[i];
        }
        return gryffindor;
    }

}