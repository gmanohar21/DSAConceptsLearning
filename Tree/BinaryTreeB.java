package Tree;

public class BinaryTreeB {
    // Tree Structure
    // 1
    // 2 3
    // 4 5 -1 6
    // -1 -1 -1 -1 -1 -1

    // Pre-Order Means(root,left,right) 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1
    // Time Complexity O(N)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree t = new BinaryTree();
        Node root = t.buildTree(Nodes);
        System.out.println(root.data);
    }
}
