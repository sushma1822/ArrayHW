public class SumValues {
    public static void main(String[] arg){
        // creating two matrices
       int p[][]={{2,3,4},{1,2,3}};
       int n[][]={{1,2,3},{2,3,4}};
       // creating another matrix to store the sum of two matrices
        int c[][]=new int[2][3];
        // adding and printing addition of 2 matrices
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 3; j++) {
          c[i][j]=p[i][j]+n[i][j];
          System.out.print(c[i][j]);

            }
            System.out.println();
        }

    }
}
