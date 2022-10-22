package task01;

import java.util.Arrays;

public class ArrayTest02 {
    public static void main(String[] args) {
        String[] arrStr = {"how", "are", "you"};
        for(String s : arrStr){
            System.out.print(s);
            System.out.print(" ");
        }

        int[][] ints = {{1, 50}, {90, 89}, {98, 7888}};
        for (int i = 0; i < ints.length; i++){
            for(int index = 0; index < ints[i].length; index++){
                System.out.println(ints[i][index]);
            }
        }

        String[] newArr = new String[3];
        //String[] newArr = {};
        System.arraycopy(arrStr, 0, newArr, 0, 3);
        //System.out.println(newArr.length);
        Arrays.sort(newArr);
        int index = Arrays.binarySearch(newArr, "ar");
        System.out.println(index==-1? "not exist" : ("the index is "+index));
        for(String s : newArr){
            System.out.println(s);
        }
        boolean sex = false;
        String str = sex? "male" : "female";
        //System.out.println(str);
        //System.out.println(sex? "male" : "female");
        System.out.println(true? "yes" : "no");



    }
}
