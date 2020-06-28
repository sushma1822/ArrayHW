public class DuplicateValues {
    public static void main(String[] arg) {
        int[] my_array = {2, 3, 3, 4, 5, 5, 7, 7, 9};
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " +my_array[j]);

                }

            }
        }
    }
}