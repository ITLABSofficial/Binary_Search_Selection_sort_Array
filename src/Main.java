/*# Welcome to my project!
ITLABSofficial
        # This application sorts a user-provided list (or you can use the default list) and then checks if a given number exists in the list.
# If the number exists, it shows the index of that number.

        # How to use:
        # 1. First, either input your own list or use the default list provided.
        # 2. The list will be sorted.
# 3. Then, input a number, and the program will check if the number exists in the list and at which index.

        # Thank you for downloading and using this project! :)
        # If you'd like to contribute, feel free to submit a pull request.
        #Also, feel free to reach out with any feedback or suggestions!
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array1[] = {
                3, 14, 159, 265, 35, 897, 931, 15, 99,
                7, 96, 3, 4, 68, 5, 441, 8, 5, 16, 1, 5,
                90, 576, 17, 1, 8, 75, 1, 4, 159, 265, 3,
                589, 79, 31, 159, 979, 634, 6, 854, 41, 85,
                161, 5, 90, 576, 1, 7, 187, 5, 41, 46, 87,
                45, 50, 95, 97, 49, 73, 78, 21, 22, 13, 53, 67, 49,
                36, 53, 78, 42, 39, 41, 56, 44, 28, 12,
                38, 426, 226, 413, 358, 327, 388, 946, 206, 423,
                18, 42, 78, 56, 66, 33, 18, 322, 38, 46,
                26, 43, 38, 32, 38, 46, 26, 41, 35, 72,
                98, 46, 16, 23, 68, 42, 58, 76, 46, 43,
                38, 32, 38, 46, 26, 43, 38, 32, 38, 46,
                1, 2, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16,
                17, 1, 19, 20, 29, 24, 23, 26, 29, 45, 56, 78, 98,
                67, 65, 70, 76, 74, 72, 73, 71, 76, 79, 90, 91, 95,
                103, 108, 109, 106, 110, 190, 178, 54, 35, 39, 37,60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,
                76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
                96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115,
                116, 161,117, 118, 119, 123, 121, 122,120 ,  167, 168, 169, 170, 171, 172, 173, 174, 175,131,
                136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 166, 147, 148, 149, 150, 151, 152, 153, 154, 155,
                156, 157, 158, 159, 160,  162, 163, 164, 165,146 ,124, 125, 126, 132, 133, 134,127, 128, 129, 130,
                176, 177, 178, 179, 180,  135,
        };



        // sorted array
        int[] sortedarray = selectionsortarray(array1);
        System.out.println();


        // Get the number to search from the user///
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Which number are you looking for? Please enter (-1 to exit):");
            int search = scan.nextInt();

            // stop
            if (search == -1) {
                System.out.println("Program terminated.");
                break; //
            }

            // Binary search with search
            int result = binarysearch(sortedarray, search);
            if (result == -1) {
                System.out.println("No such element found.");
            } else {
                System.out.println("Result is: " + result);
            }
        }
    }

    // Selection Sort fonk
    public static int[] selectionsortarray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // Binary Search fonk
    public static int binarysearch(int[] sortedarray, int search) {
        int lastmemberindex = sortedarray.length - 1;
        int firstmemberindex = 0;

        while (lastmemberindex >= firstmemberindex) {
            int hydrangeanenberindex = (lastmemberindex + firstmemberindex) / 2;
            if (search < sortedarray[hydrangeanenberindex]) {
                lastmemberindex = hydrangeanenberindex - 1;
            } else if (search == sortedarray[hydrangeanenberindex]) {
                System.out.println("Searching " + search + " in this index " + hydrangeanenberindex);
                return hydrangeanenberindex;
            } else {
                firstmemberindex = hydrangeanenberindex + 1;
            }
        }
        return -1; // if dont found return -1
    }

    // Array write
    public static void writearay(int[] array) {
        for (int i : array) {
            System.out.print(i);
            System.out.print(",");
        }
    }
}
