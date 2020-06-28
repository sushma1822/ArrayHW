public class TransposeMatrix {
    public static void main(String[] arg){

        final int[][] original = new int[][] { { 1, 2, 3,}, { 5, 6, 7,}, { 9, 10, 11,} };
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n matrix transpose:\n");
        // transpose
        if (original.length > 0) {
            for (int i = 0; i < original[0].length; i++) {
                for (int j = 0; j < original.length; j++) {
                    System.out.print(original[j][i] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
