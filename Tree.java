class Node
{
  int data;
  Node left;
  Node right;
    int height  ;
  public Node(int val)
  {
    data=val;
    left=null;
    right=null;
  }
}
class tree
{
   static int lc=0;
  Node create(int val)
  {
    return new Node(val);
  }
  Node insert(Node root, int val)
  {
    if(root==null)
    {
      return create(val);
    }
    if(val<root.data)
    {
      root.left=insert(root.left,val);
    }
    else
    {
      root.right=insert(root.right,val);
    }
    return root;
  }
    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void preorder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void level_order(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public void top_view(Node root){
        TreeMap<Integer, Integer> m = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            int h = curr.height;
            
            if(!m.containsKey(h)){
                m.put(h,curr.data);
            }
            if(curr.left != null){
                q.add(curr.left);
                curr.left.height = h - 1;
            }
            if(curr.right != null){
                q.add(curr.right);
                curr.right.height = h + 1;
            }
        }
        for(Integer i  : m.values()){
            System.out.print(i+" ");
        }
    }
    public void left_view(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size ;i++){
                Node curr = q.poll();
                if(i == 0){
                    System.out.print(curr.data +" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null ){
                    q.add(curr.right);
                }
            }
        }
    }
    public void right_view(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size ;i++){
                Node curr = q.poll();
                if(i ==size-1){
                    System.out.print(curr.data +" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null ){
                    q.add(curr.right);
                }
            }
        }
    }
    
    public Node search(Node root,int key){
        if(root==null){
            return null;
        }
            if(root.data==key){
                return root;
            }
            if(root.data>key) return search(root.left,key);
            return search(root.right,key);
    }
    
    public int leafnode(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null) 
            return 1;
        return leafnode(root.left)+leafnode(root.right);
    }
    
     public void findmax(Node root){
             if(root.right!=null){
                 findmax(root.right);       
         }
         else{
                 System.out.print("max:"+root.data);
             }
     }
    
    public Node findmin(Node root){
             if(root.left!=null){
                 return findmin(root.left);       
         }
         return root;
     }
    
    public Node delete(Node root,int key){
        if(root==null){
            return null;
        }
        if(key<root.data){
            root.left=delete(root.left,key);
        }else if(key>root.data){
            root.right=delete(root.right,key);
        }else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            Node temp=findmin(root.right);
            root.data=temp.data;
            root.right=delete(root.right,temp.data);
        }
        return root;
    }
    
  public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    tree t1=new tree();
    int k=in.nextInt();
    Node root=t1.create(k);
    while(true)
    {
      int data=in.nextInt();
      if(data==-1)
      {
        break;
      }
      t1.insert(root,data);
    }
      System.out.println("Inorder: ");
      t1.inorder(root);
      System.out.println("\nPre-order: ");
      t1.preorder(root);
      System.out.println("\nPost-order: ");
      t1.postorder(root);
      System.out.println("\nLevel - order: ");
      t1.level_order(root);
      System.out.println("\nTop View : ");
      t1.top_view(root);  
      System.out.println("\nLeft View : ");
      t1.left_view(root);
      System.out.println("\nRight View : ");
      t1.right_view(root);
      System.out.println("\nleaf node : ");
      System.out.print(t1.leafnode(root));
      t1.delete(root,10);
      System.out.println("\ndeleted 10 : ");
      t1.level_order(root);
      Node temp=t1.search(root,10);
      if(temp!=null) System.out.println("\nFound");
      else System.out.println("\nNot found");
  }
}
