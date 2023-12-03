import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
    }
    TreeNode (int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left =left;
        this.right = right;
    }
}


public class InOrderTraversal {
    static List <Integer> result;
    public static void main(String[] args) {
        TreeNode left =  new TreeNode (2);
        TreeNode right = new TreeNode (3);
        TreeNode root = new TreeNode (1,left,right);
        left.left = new TreeNode (4);
        left.right = new TreeNode (5);
        right.left = new TreeNode (6);
        right.right = new TreeNode (7);

        result = new ArrayList<Integer>();
        System.out.println("Pre Order Traversal : " + preorderTraversal(root));
        result = new ArrayList<Integer>();
        System.out.println("Inorder Traversal : " + inorderTraversal(root));

    }
    

private static List <Integer> inorderTraversal(TreeNode root){
    Stack<TreeNode> stack = new Stack <TreeNode>();
    TreeNode current = root;
    while(true) {
        while ( current != null) {
            stack.push(current);
            current= current.left;
        }
        if(stack.isEmpty()) break;
        current =  stack.pop();
        result.add(current.val);
        current = current.right;
    }
    return result;
}

private static List<Integer> preorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack <TreeNode>();
    TreeNode current = root;
    while (true) {
        while(current != null){
            result.add(current.val);
            stack.push(current);
            current = current.left;
        }
        if (stack.isEmpty()) break;
        current = stack.pop();
        current = current.right;
    }
    return result;
}
}

