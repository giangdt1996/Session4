import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//       // Khai bao mang
//        int[] arrInt={1,2,3,4};
//        int arrInt1[];
//        System.out.println("Mang ban dau =>>> " + Arrays.toString(arrInt));
//        test(arrInt);
//        System.out.println("mang sau khi thay doi =>>> "+ Arrays.toString(arrInt));
//    }
//    public static void test(int[] arr){
//        arr[1]=10;
//    }
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b = 10;
        int index = 5;
        int arrUpdate[] = new int[10];
//    for(int i=0; i<arrUpdate.length; i++){
//        if(i<index){
//            arrUpdate[i]=array[i];
//        }else if(i==index){
//            arrUpdate[i]=b;
//        }else{
//            arrUpdate[i]=array[i-1];
//
//        }
//    };
//        System.out.println(Arrays.toString(arrUpdate));
//}
        insertArray(array, b, index,  arrUpdate);
    }
public static void insertArray(int[] array, int value, int index, int[] arrUpdate){
    for(int i=0; i<arrUpdate.length; i++){
        if(i<index){
            arrUpdate[i]=array[i];
        }else if(i==index){
            arrUpdate[i]= value;
        }else{
            arrUpdate[i]=array[i-1];

        }
    };
    System.out.println(Arrays.toString(arrUpdate));
}

}