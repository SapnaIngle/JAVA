package practice;

import java.util.Arrays;

public class JavaTask {

    public static void main(String[] args)  {

       /**
        * Array duplicate elements: [2,0,0,1,3,9,2,5,2]
        * */

        int[] array = new int[]{2, 0, 0, 1, 3, 9, 2, 5, 2};
        System.out.println("Duplicate elements in given array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j] + " ");
                }
            }
        }

    }
}


    /**
     * sort array: [2,82,98,17,29]
     * */
    class SortArray{
        public static void main(String[] args) {
            int[] array = new int[] {2,82,98,17,29};
            int temp =0;

            System.out.println("Elements of original array: ");
            for (int i= 0; i < array.length; i++){
                System.out.println(array[i] + "");
            }

            // Ascending order
            for(int i=0; i < array.length; i++){
                for(int j=i+1; j < array.length; j++){
                    if(array[i] > array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }

                }
            }
            System.out.println();

            System.out.println("Elements of array in ascending order");
            for(int j=0; j < array.length; j++){
                System.out.println(array[j] + "");
            }

            System.out.println();

            // Descending order
            for(int i=0; i < array.length; i++){
              for(  int j=i+1; j < array.length; j++){
                  if(array[i] < array[j]){
                      temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;
                  }
              }
            }
            System.out.println("Elements of array in descending order");
            for(int j=0; j < array.length; j++){
                System.out.println(array[j] +"");
            }

        }
    }



/**
 * str1 = "aabbccda"
 * */
    class LetterCount {

//    public static void main(String[] args) {
//        String str = "aabbccda";
//        String result = "";
//        int count = 1;
//        for(int i=0; i < str.length()-1; i++){
//            if(str.charAt(i) == str.charAt(i+1)) {
//                count++;
//                continue;
//            } else{
//                result = result + count + str.charAt(i);
//                count = 1;
//            }
//        }
//
//        result = result + count + str.charAt(str.length()-1);
//        System.out.println(result);
//    }
//}

    public static void main(String[] args) {
        String str = "aabbccda";
        char[] arr = str.toCharArray();
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
                i = j;
            }
            System.out.print(arr[i] + "" + count);
        }

    }

    /**
     * int m = 17;
     * int n = 3;
     * closest to m and divisible by n
     */

    class ClosestNumber {
        public static void main(String[] args) {
            int m = 17;
            int n = 3;

            // find the quotient
            int q = m / n;
            // 1st possible closest number
            int n1 = n * q;
            // 2nd possible closest number
            int n2 = (m * n) > 0 ? (n * (q + 1)) : (n * (q - 1));
            if (Math.abs(m - n1) < Math.abs(m - n2)) ;


        }
    }


    /**
     * check whether the two strings are anagram
     * String1 = "Heart";
     * String2 = "Earth";
     */

    class Anagram {
        public static void main(String[] args) {
            String str1 = "Heart";
            String str2 = "Earth";

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if length is same
            if (str1.length() == str2.length()) {

                // Converting strings to char array
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                // Sorting the char Array
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                boolean result = Arrays.equals(charArray1, charArray2);
                if (result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
        }
    }
}

