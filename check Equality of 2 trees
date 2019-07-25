public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
public boolean equal(TreeNode t1,TreeNode t2){
	    	if(t1==null&&t2==null)
	    		return true;
	    	if(t1==null||t2==null)
	    		return false;
	    	return (t1.val==t2.val)&&equal(t1.left,t2.left)&&equal(t1.right,t2.right);
	    }
