import java.util.ArrayList;

public class FindingAPath {
    public static class BinaryNode {
        BinaryNode left;
        BinaryNode right;
        int value;

        public BinaryNode(int val, BinaryNode left, BinaryNode right) {
            this.value = val;
            this.left = left;
            this.right = right;
        }
    }

    boolean pathSum(BinaryNode root, int sum, ArrayList<BinaryNode> pathNumbers) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (root.value == sum) {
                pathNumbers.add(root);
                return true;
            } else {
                return false;
            }
        }
        int subSum = sum - root.value;
        if (pathSum(root.left, subSum, pathNumbers) || pathSum(root.right, subSum, pathNumbers)) {
            pathNumbers.add(root);
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int sum = 22;
        FindingAPath p = new FindingAPath();
        BinaryNode node7 = new BinaryNode(7, null, null);
        BinaryNode node2 = new BinaryNode(2, null, null);
        BinaryNode node1 = new BinaryNode(1, null, null);
        BinaryNode node11 = new BinaryNode(11, node7, node2);
        BinaryNode node13 = new BinaryNode(13, null, null);
        BinaryNode node4right = new BinaryNode(4, null, node1);
        BinaryNode node4left = new BinaryNode(4, node11, null);
        BinaryNode node8 = new BinaryNode(8, node13, node4right);
        BinaryNode root = new BinaryNode(5, node4left, node8);
        ArrayList<BinaryNode> path = new ArrayList<>();
        boolean result = p.pathSum(root, sum, path);
        if (result) {
            path.forEach(BinaryNode -> System.out.print(BinaryNode.value + " "));
        } else {
            System.out.println("No path for sum " + 22);
        }
    }
}
