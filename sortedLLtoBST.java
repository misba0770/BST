class Solution
{
    public TNode sortedListToBST(LNode head)
    {
        //code here
        return sort(head);
    }
     public TNode sort(LNode head){
         if(head.next==null)return new TNode(head.data);
         LNode mid=head;
         LNode prev=null;
         LNode fast=head;
         while(fast!=null&&fast.next!=null){
             fast=fast.next.next;
             prev=mid;
             mid=mid.next;
         }
         
         TNode x=new TNode(mid.data);
         if(prev!=null){prev.next=null;
         x.left=sort(head);}
         if(mid.next!=null)
         x.right=sort(mid.next);
         return x;
         
     }
}
