/** A three-node binary tree.Binary search tree (BST) is a binary tree where the value of each node is larger
 * or equal to the values in all the nodes in that node's left subtree and is smaller than the values in all
 * the nodes in that node's right subtree.
 *
 * Write a function that, efficiently with respect to time used, checks if a given binary search tree
 * contains a given value. For example, for the following tree:
 *
 * n1 (Value: 1, Left: null, Right: null)
 * n2 (Value: 2, Left: n1, Right: n3)
 * n3 (Value: 3, Left: null, Right: null)
 * Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.
**/

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value){
        if(value == root.value){
            return true;
        }
        if(value > root.value && root.right != null){
            return contains(root.right, value);
        }
        if(value < root.value && root.left != null){
            return contains(root.left, value);
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, n2, n5);
        Node n7 = new Node(7, null, null);
        Node n9 = new Node(9, null, null);
        Node n8 = new Node(8, n7, n9);
        Node n6 = new Node(6, n4, n8);
        Node n11 = new Node(11, null, null);
        Node n13 = new Node(13, null, null);
        Node n15 = new Node(15, null, null);
        Node n14 = new Node(14, n13, n15);
        Node n12 = new Node(12, n11, n14);
        Node n10 = new Node(10, n6, n12);

        System.out.println(contains(n11, 3));
    }
}