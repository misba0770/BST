class Tree
{
    int c=0;
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        solve(root,l,h);
        return c;
    }
    void solve(Node root,int l,int h){
        if(root==null)return;
        if(root.data>l&&root.data>h){
            solve(root.left,l,h);
        }
        else if(root.data<l&&root.data<h){
            solve(root.right,l,h);
        }
        else{
            solve(root.left,l,h);
            c++;
            solve(root.right,l,h);
        }
    }
}
