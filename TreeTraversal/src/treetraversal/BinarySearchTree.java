package treetraversal;
public class BinarySearchTree {
    private Node root;
    static class Node {
        int key;
        Node left, right;
        Node(int item) {
            key = item;
            left = right = null;
        }
    }
    public void insert(int key) {
        root=insert(root, key);
    }
    private Node insert(Node node, int key) {
        if(node==null){
        node=new Node(key);
        return node;
        }
        if(key<node.key)
        node.left=insert(node.left,key);
        else if(key>node.key)
        node.right=insert(node.right,key);
        return node;
    }
    public boolean search(int key) {
        return search(root, key);
    }
    private boolean search(Node node, int key) {
        if (node == null)
            return false;
        if (key == node.key)
            return true;
        return key < node.key? search(node.left, key):search(node.right, key);
    }
    public void inorder() {
    inorder(root);
    }
    private void inorder(Node node) {
        if(node!=null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
    public void preorder() {
        preorder(root);
    }
    private void preorder(Node node) {
     if(node!=null){
     System.out.print(node.key + " ");
     preorder(node.left);
     preorder(node.right);
        }
    }
    public void postorder() {
    postorder(root);
    }
    private void postorder(Node node) {
        if(node!=null) {
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println("In-order:");
        bst.inorder();
        
        System.out.println("\n\nPre-order:");
        bst.preorder();

        System.out.println("\n\nPost-order:");
        bst.postorder();
        
        System.out.println("\n\nSearch for 40: " + bst.search(40));
        System.out.println("Search for 90: " + bst.search(90));
    }
}
