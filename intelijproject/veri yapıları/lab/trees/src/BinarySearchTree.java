public class BinarySearchTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left= null;
            right= null;

        }
    }
    Node root;
    public BinarySearchTree(){
        root= null;
    }
    public void insert(int v){
        if(root == null){
            root = new Node(v);
            return;
        }
        Node cur = root;
        while(true){
            if(v < cur.data){
                if(cur.left == null){
                    cur.left = new Node(v);
                    return;
                }
                cur = cur.left;
            }else{
                if(cur.right == null){
                    cur.right = new Node(v);
                    return;
                }
                cur = cur.right;
            }
        }
    }
    public boolean search(int v){
        Node cur = root;
        while(cur != null){
          if(v == cur.data)return true;
          cur =(v < cur.data) ? cur.left : cur.right;
        }
        return false;
    }



}