class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       p.pre=null;
       s.succ=null;
       Node temp=root;
       while(root!=null){
           if(root.data<=key){
               root=root.right;
           }
           else{
               s.succ=root;
               root=root.left;
           }
       }
       
       while(temp!=null){
           if(temp.data<key){
             
           
               p.pre=temp;
               temp=temp.right;
           }else{
                 temp=temp.left;
           }
           }
       
       return;
    }
}
