package controlflowstatement;

public class StarPattern {
    public static void main(String[] args) {
        /**
         *   *
         *   **
         *   ***
         *   ****
         *
         *   4 rows
         *   4 columns
         * */

        for (int i = 1; i <= 4; i++) {    // for rows
            for (int j = 1; j <= i; j++) {    // for columns
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        /**
         *    ****
         *    ***
         *    **
         *    *
         * **/

        for (int i = 1; i <= 4; i++) {    // for rows
            for (int j = i; j <= 4; j++) {    // for columns
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.println();


        /**
         *   ****
         *    ***
         *     **
         *      *
         * **/
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println();


        /**
         *      *
         *     **
         *    ***
         *   ****
         * */

        for(int i = 1; i <=4; i++){
            for(int j = i; j <= 4; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        int counter=1;
        for(int i=1; i<=4; i++){
            for(int j=i; j <= i; j++){
                System.out.print(" " +counter++);
            }
            System.out.println();
        }
    }
}

