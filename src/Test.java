import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {
    static void unique(int []array, int sum){
        HashSet< Integer> testSet=new HashSet<>();
        for (int i=0;i< array.length;i++){
            int temp=sum-array[i];
            if (testSet.contains(temp)){
                System.out.println("pairs : " + temp + "," + array[i] );

            }
            testSet.add(array[i]);
        }

    }
    public static void main(String []args){
        Test object=new Test();
        int []array={3, 1 , 7, 9, 100, 20, 8,  20, 21};
        unique(array, 120);
    }
}
