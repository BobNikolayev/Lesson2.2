import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws RuntimeException {

      String [][] arr = {
            { "1", "1", "1", "1"},
            { "1", "1", "1", "1"},
            { "1", "1", "1", "1"},
            { "1", "1", "1", "1"},
        };



//        for (int j = 0; j < arr.length ; j++) {
//            for (int i = 0; i < arr.length ; i++) {
//            arr[i][j] = "1";
//         }
//        }


        System.out.println(Arrays.deepToString(arr));

        array(arr);




    }

    public static void array (String [][] arr){

        if(arr.length > 4 || arr[0].length > 4 || arr[1].length > 4 || arr[2].length > 4 || arr[3].length > 4 ){
            throw new ArrayIndexOutOfBoundsException("Массив должен быть 4 х 4");
        }

        int iCount = 0;
        int jCount = -1;

        int[][] newArr = new int [4][4];

        arr[2][2] = "text G";

        try{
            int sum = 0;

            for (int j = 0; j < arr.length ; j++) {
            iCount = 0;
            jCount++;
            for (int i = 0; i < arr.length; i++) {
             int a = Integer.parseInt(arr[j][i]);
                newArr[j][i] = a;
                sum += newArr[j][i];
             iCount++;
             }
        }
            System.out.println(sum);
        } catch(RuntimeException r){

            System.out.println("В массиве не должно быть символов "+ r.getMessage());
            System.out.println("Ошибка в arr " + jCount +" "+ iCount  );
            throw r;
        }


    }



}
