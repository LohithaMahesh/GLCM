public class MainClass {

    final static int[][] Input = {
        {1, 1, 5, 6, 8},
        {2, 3, 5, 7, 1},
        {4, 5, 7, 1, 2},
        {8, 5, 1, 2, 5}
    };

    public static int getMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    static int maxValue = getMaxValue(Input);

    public static void main(String[] args) {

        System.out.println("Input");
        for (int row = 0; row < Input.length; row++) {
            for (int col = 0; col < Input[row].length; col++) {
                System.out.print(Input[row][col] + " ");
            }
        }
    }
}
                
                
                