// -1 is treated as null 
import java.util.*;
public class implementationOfBinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root){
        // root, left subtree, right subtree
        if(root == null){
            return;
        }
        //Printing the root element of the tree
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    } 

    public static void inOrder(Node root){
        // left subtree, root , right subtree
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postorder(Node root)
    // left subtree, right subtree, root
    {
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null)
            {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
    }
    // Count of Nodes
    public static int countOfNodes(Node root){
        if(root == null)
        {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    //Sum of Nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum =  sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }

    //Height of the tree
    public static int heightOfTree(Node root){
        if(root == null)
        {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)+1;
        return myHeight;
    }

    //Diameter of the tree
    public static int diameter(Node root){
        if(root == null)
        {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left)+ heightOfTree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public class static Treeinfo{
        int ht;
        int diam;

        Treeinfo(int ht, int diam)
        {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static Treeinfo diameter2(Node root){
        if(root == null){
            return new Treeinfo(0, 0);
        }
        Treeinfo left = diameter2(root.left);
        Treeinfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht+1;

        int mydiam = Math.max(Math.max(diam1,diam2), diam3);

        Treeinfo myInfo = new Treeinfo(myHeight, mydiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("PreOrder Sequence");
        preOrder(root);
        System.out.println("Inorder Traversal");
        inOrder(root);
        System.out.println("PostOrder Traversal");
        postorder(root);
        System.out.println("Level Order Traversal");
        levelorder(root);

        System.out.println();
        System.out.println("Count of nodes: "+countOfNodes(root));

        System.out.println("Sum of nodes: "+sumOfNodes(root));

        System.out.println("Height of the tree: "+heightOfTree(root));

        System.out.println("Diameter of tree: "+diameter(root));

        System.out.println("Diameter of tree2: "+ diameter2(root).diam);



    }
}