import java.util.*;

public class Test1 {
    public static void main(String []args){
    HashSet<Integer> map=new HashSet<>();
    int target=22;
    int [] array={5,7,1,10,15,3};
     for(int i=0;i< array.length;i++)  {
         map.add(array[i]);
         int s=target-array[i];
         if (map.contains(s)){

         }
     }



    }
}
