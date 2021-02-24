import java.util.Arrays;





public class Main 
{
    public static void main(String[] args) 
    {
        int[][] matrix = new int[4][6];

        matrix[0] = new int[13];
        matrix[1][1] = 2;
        matrix[2][2] = 3;
        matrix[1][3] = 4;
        matrix[2][4] = 5;
        matrix[3][5] = 6;

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));


        int[][][] cube = new int[2][3][4];
        System.out.println("\n\n ----------- \n");

        System.out.println(Arrays.toString(cube));
        System.out.println(Arrays.toString(cube[0]));
        System.out.println(Arrays.toString(cube[0][0]));
    }
}