class Tree {
    /* Complete the function to get diameter of a binary tree */
    static class Result{
        int ans = Integer.MIN_VALUE;
    }
    int height(Node root,Result res){
        if(root==null)
        return 0;
        int lh= height(root.left,res);
        int rh = height(root.right,res);
        res.ans= Math.max(res.ans,lh+rh+1);
        return 1+Math.max(lh,rh);
    }
    int diameter(Node root) {
        if(root == null)
        return 0;
        // Your code here
      Result res= new Result();
      int h = height(root,res);
      return res.ans;
    }
}
