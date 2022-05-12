class GfG
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        if(root==null)return root;
        ArrayList<Node> list=new ArrayList<>();
        inorder(root,list);
        return makeTree(list,0,list.size()-1);
    }
    Node makeTree(ArrayList<Node> list,int l,int r){
        if(l>r)return null;
        int mid=l+(r-l)/2;
        Node root=list.get(mid);
        root.left=makeTree(list,l,mid-1);
        root.right=makeTree(list,mid+1,r);
        return root;
    }
    void inorder(Node root,ArrayList<Node> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
        
    }
}
