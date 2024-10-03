package magic.hat;

import java.util.Random;

public class MagicHat2 {

    static final String[] names = new String[]{"Mirko Risuleo", "Karen Russo", "Salvatore Tavella", "Alessia Pallavera", "Pierluigi Micozzi", "Eleonora Siciliano", "Gianluca Pricopie", "Miryam Massa", "Pamela Milanese", "Ejran Mustafoski", "Andrea Macellaro La Franca", "Alessandro Massa", "Pietro Marinari", "Alessandro Stelitano", "Stefano Puro", "Lucrezia Lauri", "Mario Peccio", "Lorenzo Masci", "Danilo Vulpiani", "Carlotta Pisano", "Ilies Chikhaoui", "Samuele Celletti", "Gabriele Sabatini", "Joshua Castellani", "Macali Roberto", "Lorenzo Salvatori", "Marco Falconetti", "Luca Galimberti", "Matteo Fratti"};
    static final House[] prefs = {House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR, House.HUFFLEPUFF};
    static final int NUM_HOUSES = House.values().length;
    static final int STANDARD_HOUSE_SIZE = names.length/NUM_HOUSES;
    static final int EXTENDED_HOUSE_SIZE = STANDARD_HOUSE_SIZE+1;
    static final int STANDARD_NUM_STUDENT = names.length/NUM_HOUSES*NUM_HOUSES; //Numero totale di studenti assegnabili senza eccedenze, calcolato per fare in modo che il numero di studenti sia divisibile per il numero delle casate.
    static final int[] HOUSE_COUNTS = new int[NUM_HOUSES];
    static final Random fate = new Random();

    public static void main(String[] Args){

        String[][] houses = {new String[EXTENDED_HOUSE_SIZE], new String[EXTENDED_HOUSE_SIZE], new String[EXTENDED_HOUSE_SIZE], new String[EXTENDED_HOUSE_SIZE]};

        assignStudentsToStandardSize(houses);

        assignExtraStudents(houses);

        showHouses(houses);

    }

    private static void assignStudentsToStandardSize(String[][] houses){

        for (int i=0; i<STANDARD_NUM_STUDENT; i++){
            chooseHouse(i, houses, false);
        }

    }

    private static void assignExtraStudents(String[][] houses){
        for (int i =STANDARD_NUM_STUDENT; i< names.length; i++){
            chooseHouse(i, houses, true);
        }

    }

    private static void showHouses (String[][] houses){
        System.out.printf("%-20s %-20s %-20s %-20s %n", House.HUFFLEPUFF, House.RAVENCLAW, House.SLYTHERIN, House.GRYFFINDOR);
        for (int i = 0; i<EXTENDED_HOUSE_SIZE; i++){
            System.out.printf("%-20s %-20s %-20s %-20s %n", houses[0][i], houses[1][i], houses[2][i], houses[3][i]);
        }
    }

    private static void chooseHouse(int i, String[][] houses, boolean extended){
        boolean assigned = false;
        do{
            int pos = fate.nextInt(NUM_HOUSES);
            if (HOUSE_COUNTS[pos] >= (extended ? EXTENDED_HOUSE_SIZE : STANDARD_HOUSE_SIZE)){
                continue;
            }
            if(getPrefHouse(i) == null || getHouse(pos) == getPrefHouse(i)){
                insertIntoHouse(houses, pos, names[i]);
                assigned = true;
            } else {
                if(fate.nextBoolean()){
                    insertIntoHouse(houses, pos, names[i]);
                    assigned = true;
                } else {
                    System.out.printf("Lo studente %s, che ha preferenza per %s, ha resistito l'assegnazione a %s. %n", names[i], getPrefHouse(i), getHouse(pos));
                }
            }

        }while (!assigned);
    }

    private static void insertIntoHouse(String[][]houses, int pos, String student){
        houses[pos][HOUSE_COUNTS[pos]] = student;
        HOUSE_COUNTS[pos]++;
        System.out.printf("%s a... %n", student);
        try {
            Thread.sleep(fate.nextInt(5000));
        } catch (Exception e){

        }
        System.out.printf("%s! %n", getHouse(pos));
    }


    private static House getHouse(int pos){
        return House.values()[pos];
    }

    private static House getPrefHouse(int n){
        return prefs[n];
    }

}
