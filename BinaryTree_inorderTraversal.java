
public class BinaryTree_inorderTraversal {

    // 1. Change Object to Node so Java knows exactly what it's working with
    public static void inorder(Node node) {
        if (node == null) {
            return;
        }

        // Left, Root, Right traversal
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        // 2. Instantiate your tree container
        BinaryTree_creation treeContainer = new BinaryTree_creation();

        // 3. Call your creation method directly! 
        // (Change "createSampleTree" if your actual method name in the other file is different)
        treeContainer.createSampleTree(); 

        System.out.println("Inorder Traversal of the Binary Tree: ");
        
        // 4. Pass the root directly without using reflection fields
        inorder(treeContainer.root);
        System.out.println(); // For a clean new line at the end
    }
}