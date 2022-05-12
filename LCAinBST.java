class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
    if(root==null)return null;
    int curr=root.data;
    if(curr<n1&&curr<n2)return LCA(root.right,n1,n2);
    if(curr>n1&&curr>n2)return LCA(root.left,n1,n2);
    return root;
    }
    
}
