package foreach;

public class ArrayBidimensional {
    public static void main(String[] args){

        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);

        for (int i =0; i < myNumbers.length;i++){
            for (int j = 0; myNumbers[i].length > j; i++){
                System.out.println(myNumbers[i][j]);


            }

        }
    }
}
