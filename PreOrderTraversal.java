import java.util.ArrayList;
import java.util.List;

//import javax.swing.tree.TreeNode;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class PreOrderTraversal {

    static List <Integer> result = new ArrayList<Integer>();
    public static void main (String[] args){
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1,left,right);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        result = PreOrderTraversal(root);
        System.out.print(result);
    }
    
    public static List<Integer> PreOrderTraversal(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            PreOrderTraversal(root.left);
            PreOrderTraversal(root.right);
        }
        return result;
    }
}
