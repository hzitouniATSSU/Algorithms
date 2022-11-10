public class NodeCount {
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
    public int countNode(BinaryNode root){
        if (root==null){
            return 0;
        }else{
            return 1+countNode(root.left)+countNode(root.right);
        }

    }
    public static void main (String []args){
        NodeCount c =new NodeCount();
        BinaryNode node7 = new BinaryNode(7, null, null);
        BinaryNode node2 = new BinaryNode(2, null, null);
        BinaryNode node1 = new BinaryNode(1, null, null);
        BinaryNode node11 = new BinaryNode(11, node7, node2);
        BinaryNode node13 = new BinaryNode(13, null, null);
        BinaryNode node4right= new BinaryNode(4, null, node1);
        BinaryNode node4left = new BinaryNode(4, node11, null);
        BinaryNode node8 = new BinaryNode(8, node13, node4right);
        BinaryNode root = new BinaryNode(5, node4left, node8);
        System.out.println("Number of nodes in the tree: " + c.countNode(root));

    }

    }
