package magic.hat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MagicHat {
    public static void main(String[] Args){

        String[]studentsName = new String[]{"Mirko Risuleo", "Karen Russo", "Salvatore Tavella", "Alessia Pallavera", "Pierluigi Micozzi", "Eleonora Siciliano", "Gianluca Pricopie", "Miryam Massa", "Pamela Milanese", "Ejran Mustafoski", "Andrea Macellaro La Franca", "Alessandro Massa", "Pietro Marinari", "Alessandro Stelitano", "Stefano Puro", "Lucrezia Lauri", "Mario Peccio", "Lorenzo Masci", "Danilo Vulpiani", "Carlotta Pisano", "Ilies Chikhaoui", "Samuele Celletti", "Gabriele Sabatini", "Joshua Castellani", "Macali Roberto", "Lorenzo Salvatori", "Marco Falconetti", "Luca Galimberti", "Matteo Fratti"};

        //RANDOMIZER ARRAY STUDENTI
        List<String> StringList = Arrays.asList(studentsName);
        Collections.shuffle(StringList);
        StringList.toArray(studentsName);

        //FORMATTAZIONE E STAMPA
        System.out.println("\t\t\t\t\t\t\t\t\t\tHUFFLEPUFF");
        System.out.println(Arrays.toString(HufflePuff(studentsName)));
        System.out.println("\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\tRAVENCLAW");
        System.out.println(Arrays.toString(RavenClaw(studentsName)));
        System.out.println("\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\tSLYTHERIN");
        System.out.println(Arrays.toString(Slytherin(studentsName)));
        System.out.println("\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\tGRYFFINDOR");
        System.out.println(Arrays.toString(Gryffindor(studentsName)));
        System.out.println("\n");

    }

    public static String[] HufflePuff(String[]studentsName){

        String[] hufflePuff = new String[7];

        for (int i = 0; i<studentsName.length; i++) {
            if (i < 7) {
                hufflePuff[i] = studentsName[i];
            }
        }
        return hufflePuff;
    }

    public static String[] RavenClaw(String[]studentsName){

        String[] RavenClaw = new String[7];

        for (int i = 0; i<studentsName.length; i++) {
            if (i >=7 && i<14) {
                RavenClaw[i-7] = studentsName[i];
            }
        }
        return RavenClaw;
    }

    public static String[] Slytherin(String[]studentsName){

        String[] Slytherin = new String[7];

        for (int i = 0; i<studentsName.length; i++) {
            if (i >= 14 && i<21) {
                Slytherin[i-14] = studentsName[i];
            }
        }
        return Slytherin;
    }

    public static String[] Gryffindor(String[]studentsName){

        String[] Gryffindor = new String[8];

        for (int i = 0; i<studentsName.length; i++) {
            if (i >= 21 && i<29) {
                Gryffindor[i-21] = studentsName[i];
            }
        }
        return Gryffindor;
    }

}
