package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] studentGroups = {
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };

        System.out.println(studentGroups[0][1]); //Guluzar
        System.out.println(studentGroups[1][0]); //Torrie
        System.out.println(studentGroups[1][1]); //David

        //HOW TO GET THE SIZE OF THE studentGroups
        System.out.println(studentGroups.length); //3

        //HOW TO GET THE SIZE OF THE SECOND GROUP
        System.out.println(studentGroups[1].length); //2

        //HOW TO PRINT THE THIRD GROUP
        System.out.println(Arrays.toString(studentGroups[2])); //[Abe, Data]

        //HOW TO PRINT ALL
        System.out.println(Arrays.deepToString(studentGroups)); //[[Kaly, Guluzar, Melda], [Torrie, David], [Abe, Data]]

        //HOW TO PRINT EACH GROUP IN SEPARATE LINES
        /*
        [Kaly, Guluzar, Melda]
        [Torrie, David]
        [Abe, Data]
         */
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }
        for (String[] group : studentGroups){
            System.out.println(Arrays.toString(group));
        }

        /*
        HOW TO PRINT EACH GROUP MEMBER IN SEPERATE LINES
         */
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);
            }

        }
        for (String[] group: studentGroups){
            for (String member : group){
                System.out.println(member);
            }
        }


    }
}
