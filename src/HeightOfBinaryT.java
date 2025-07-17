import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int v) {
        value = v;
        left = right = null;
    }

}

public class HeightOfBinaryT {
    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int height = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.left);
                }

            }
            height++;
        }
        return height;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        HeightOfBinaryT tree = new HeightOfBinaryT();
        int n = tree.height(root);
        System.out.println(n);

    }

}