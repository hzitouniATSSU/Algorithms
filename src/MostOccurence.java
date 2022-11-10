public class MostOccurence {
    public static void main(String []args){
        char [] array= {'b', 'c', 'd', 'a', 'a', 'b', 'b'};
        int [] count=new int[129];
        for(int i=0;i< array.length;i++) {
            count[(int) array[i]]++;
        }
        int index=0;
        int max=count[0];
        for(int i=1;i<129;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                index=i;
            }
        }
        System.out.println("Character with most number of occurence is "+(char)(index));

        }
    }

