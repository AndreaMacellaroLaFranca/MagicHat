package magic.hat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicHat2 {

        static String[] studentsName = new String[]{"Mirko Risuleo", "Karen Russo", "Salvatore Tavella", "Alessia Pallavera", "Pierluigi Micozzi", "Eleonora Siciliano", "Gianluca Pricopie", "Miryam Massa", "Pamela Milanese", "Ejran Mustafoski", "Andrea Macellaro La Franca", "Alessandro Massa", "Pietro Marinari", "Alessandro Stelitano", "Stefano Puro", "Lucrezia Lauri", "Mario Peccio", "Lorenzo Masci", "Danilo Vulpiani", "Carlotta Pisano", "Ilies Chikhaoui", "Samuele Celletti", "Gabriele Sabatini", "Joshua Castellani", "Macali Roberto", "Lorenzo Salvatori", "Marco Falconetti", "Luca Galimberti", "Matteo Fratti"};

        static int numHouses = 4;
        static int houseSize = studentsName.length/numHouses;

        public static void main(String[] Args){

            //RANDOMIZER ARRAY STUDENTI
            List<String> StringList = Arrays.asList(studentsName);
            Collections.shuffle(StringList);
            StringList.toArray(studentsName);

            //FORMATTAZIONE E STAMPA
            String hufflePuff = Arrays.toString(createHufflePuff());
            String ravenClaw = Arrays.toString(createRavenClaw());
            String slytherin = Arrays.toString(createSlytherin());
            String gryffindor = Arrays.toString(createGryffindor());

            System.out.printf("%-20s %-20s %-20s %-20s", "hufflePuff","ravenClaw","slytherin","gryffindor");

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
                ravenClaw[i-7] = studentsName[i];
            }
            return ravenClaw;
        }

        public static String[] createSlytherin(){

            String[] slytherin = new String[7];

            for (int i = 2*houseSize; i<3*houseSize; i++) {
                slytherin[i-14] = studentsName[i];
            }
            return slytherin;
        }

        public static String[] createGryffindor(){

            String[] gryffindor = new String[8];

            for (int i = 3*houseSize; i<4*houseSize+1; i++) {
                gryffindor[i-21] = studentsName[i];
            }
            return gryffindor;
        }

}

