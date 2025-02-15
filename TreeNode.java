class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2; 
        TreeNode root = new TreeNode(nums[mid]); 

        root.left = helper(nums, left, mid - 1); 
        root.right = helper(nums, mid + 1, right); 
        return root; 
    }

   
    public void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = sol.sortedArrayToBST(nums1);
        sol.printTree(root1); 

        System.out.println();

        int[] nums2 = {1, 3};
        TreeNode root2 = sol.sortedArrayToBST(nums2);
        sol.printTree(root2);
    }
}
