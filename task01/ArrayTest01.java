package task01;

public class ArrayTest01 {
    public static void main(String[] args) {
        /*int[]  arr = new int[3];
        arr[0] = 11;
        arr[1] = 12;
        arr[arr.length - 1] = 13;

        for(int i : arr){
            System.out.println(i);
        }

        for(int i=arr.length-1; i>=0;
            i--){
            System.out.println(arr[i]);
        }*/
        ArrayTest01 a = new ArrayTest01();
        int[] arr = {20, 999, 89};
        a.doSome(new int[]{10, 20});
        a.doSome(arr);
        a.doSome(new int[3]);
    }


    public void doSome(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
