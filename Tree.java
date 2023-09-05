import java.util.*;
 
public class Tree
{
    static class Node
    {
        int data;
        Node right;
        Node left;

        Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree
    {
        public static Node root;

        public static Node Insert(int data)
        {
            Node prev = null;

            while(root != null)
            {
                prev = root;

                if(data == root.data)
                {
                    return null;
                }
                if(data < root.data)
                {
                    root = root.left;
                }
                else
                {
                    root = root.right;
                }
            }

            Node ptr = new Node(data);

            if(data < prev.data)
            {
                prev.left = ptr;
            }
            else
            {
                prev.right = ptr;
            }
            return root;
            
        }

        public static void preorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            System.out.print(root.data+", ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+", ");
            inorder(root.right);
        }

        public static void postorder(Node root)
        {
            if(root == null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+", ");
        }

        public static int Calculate(Node root)
        {
            int i = 0;
            while(root != null)
            {
                Calculate(root.left);
                Calculate(root.right);
                i++;
            }
            return i;
        }

        public static int Height(Node root)
        {
            int i = 0;;
            int j = 0;;

            while(root != null)
            {
                root = root.left;
                i++;
            }
            while(root != null)
            {
                root = root.right;
                j++;
            }

            if(i > j)
            {
                return i;
            }
            else
            {
                return j;
            }
        }

        public static Node Search(Node root,int val)
        {
            if(root == null)
            {
                return null;
            }

            if(root.data == val)
            {
                System.out.println("ELEMENT FOUND");
            }
            
            if(val > root.data)
            {
                return Search(root.right,val);
            }
            else
            {
                return Search(root.left,val);

            }
        }

        public static int CountNode(Node root)
        {
            int i,j,count;

            if(root == null)
            {
                return 0;
            }
            else
            {
                i = CountNode(root.left);
                j = CountNode(root.right);
            }
            count = i+j;

            return (count+1);
        }

        public static int Max(Node root)
        {

            Node p = root;
            while(p.right != null)
            {
                p = p.right;
            }
            return p.data;

        }

        public static int Min(Node root)
        {
    
            Node p = root;
            while(p.left != null)
            {
                p = p.left;
            }
            return p.data;
    
        }
    }


    public static void main(String args[])
    {

        BinaryTree tree = new BinaryTree();

        Node root = new Node(30);
        Node a = new Node(20);
        Node b = new Node(32);
        Node c = new Node(12);
        Node d = new Node(22);
        Node e = new Node(34);

        root.right = b;
        root.left = a;
        a.left = c;
        a.right = d;
        b.right = e;

        // System.out.println(root.left.data);

        // tree.Insert(1);
        // tree.inorder(root);
        System.out.println("");
        // System.out.println("Number os Node is "+tree.CountNode(root));
        // tree.Search(root,322);
        System.out.println(tree.Max(root));
        System.out.println(tree.Min(root));
    }
}