package BinaryTree;
class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree_creation {
    public Node root; // Must match "treeContainer.root" above

    public void createSampleTree() { // Must match "treeContainer.createSampleTree()" above
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        // ... add any other nodes you want here
    }
}