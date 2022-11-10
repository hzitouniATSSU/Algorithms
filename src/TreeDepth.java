public class TreeDepth {
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
    int maxDepth(BinaryNode n){
        if (n==null){
            return 0;
        }else{
            int leftDepth=maxDepth(n.left);
            int rightDepth=maxDepth(n.right);
            if (leftDepth>rightDepth){
                return leftDepth+1;
            }else{
                return rightDepth+1;
            }
        }
    }
    public static void main (String []args){
        TreeDepth c=new TreeDepth();
        BinaryNode node7 = new BinaryNode(7, null, null);
        BinaryNode node2 = new BinaryNode(2, null, null);
        BinaryNode node1 = new BinaryNode(1, null, null);
        BinaryNode node11 = new BinaryNode(11, node7, node2);
        BinaryNode node13 = new BinaryNode(13, null, null);
        BinaryNode node4right= new BinaryNode(4, null, node1);
        BinaryNode node4left = new BinaryNode(4, node11, null);
        BinaryNode node8 = new BinaryNode(8, node13, node4right);
        BinaryNode root = new BinaryNode(5, node4left, node8);
        c.maxDepth(root);
    }
}
