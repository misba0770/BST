class Solution
{
     ArrayList<Integer> al = new ArrayList<>();
    int i=0;
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       copyToAl(root);
       Collections.sort(al);
       bst(root);
       return root;
    }
    void copyToAl(Node root){
        if(root==null) return;
        copyToAl(root.left);
        al.add(root.data);
        copyToAl(root.right);
    }
    void bst(Node root){
        if(root==null)return;
        bst(root.left);
        root.data = al.get(i++);
        bst(root.right);
}
}
 
