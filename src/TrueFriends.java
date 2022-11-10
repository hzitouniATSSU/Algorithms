import java.util.HashMap;
import java.util.*;


public class TrueFriends {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<String> list)
    {


        Set<String> set = new LinkedHashSet<>();

        set.addAll(list);

        list.clear();


        list.addAll(set);

        return (ArrayList<T>) list;
    }
    public static class Student {
        int studentId;
        int friendIds[];

        public Student(int id, int friends[]) {
            studentId = id;
            friendIds = friends.clone();
        }
    }


    public static void main(String[] args) {
        TrueFriends object=new TrueFriends();

        Student[] students = {
                new Student(80, new int[]{53, 4, 22}),
                new Student(22, new int[]{80, 4}),
                new Student(53, new int[]{80, 22}),
                new Student(4, new int[]{22, 53}),
        };
        HashMap<Integer, int[]> map = new HashMap();
        for (Student s : students) {
            map.put(s.studentId, s.friendIds);
        }
        ArrayList<String> friends = new ArrayList<>();
        for (Map.Entry<Integer, int[]> x : map.entrySet()) {
            for (Integer i : x.getValue()) {
                int[] friend = map.get(i);
                Arrays.sort(friend);
                Integer result = Arrays.binarySearch(friend, x.getKey());
                String trueFriends = "";
                if (result >= 0) {
                    trueFriends = String.valueOf(i) + " " + String.valueOf(x.getKey());
                    friends.add(trueFriends);
                    ArrayList<Integer>
                            newList =object.removeDuplicates(friends);
                }
            }


        }
        for (String lisOfTrueFriends : friends) {
            System.out.println("TRUE FRIENDS : " + lisOfTrueFriends);
        }
    }
}

