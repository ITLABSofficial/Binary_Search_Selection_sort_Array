public class selectionsortarray {

    public static int[] array(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int smallnumberindex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallnumberindex]) {
                    smallnumberindex = j;
                }
            }
            // Swap
            int temp = a[i];
            a[i] = a[smallnumberindex];
            a[smallnumberindex] = temp;
        }
        return a;
    }
}
