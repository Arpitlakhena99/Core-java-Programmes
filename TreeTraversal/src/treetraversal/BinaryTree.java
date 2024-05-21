package treetraversal;
public class BinaryTree {
   Node root;
   public BinaryTree() {
   root=null;
    }
    void inOrder(Node node) {
     if(node!=null) {
       inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
       }
    }
    void preOrder(Node node){
        if(node!=null){
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
        }
    }
    
    void postOrder(Node node) {
    if(node!=null) {
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println("----------------------------------");
        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPre-order traversal:");
        tree.preOrder(tree.root);
        System.out.println("\nPost-order traversal:");
        tree.postOrder(tree.root);
        
    }
}
