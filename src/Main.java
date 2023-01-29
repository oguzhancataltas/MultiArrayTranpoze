public class Main {

    public static void main(String[] args) {


        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int a = array.length, b = array[0].length;

        int[][] transpose = new int[b][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                transpose[j][i] = array[i][j];
            }
        }

        for ( int[] t : transpose){
            for (int t2 : t) {
                System.out.print(t2 + " ");
            }
            System.out.println();
        }

    }
}
