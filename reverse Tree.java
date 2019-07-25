public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
public TreeNode reverseTree(TreeNode root){
	    	if(root==null)
	    		return null;
	    	TreeNode temp=root.left;
	    	root.left=root.right;
	    	root.right=temp;
	    	
	    	reverseTree(root.left);
	    	reverseTree(root.right);
	    	return root;
	    	
	    }
