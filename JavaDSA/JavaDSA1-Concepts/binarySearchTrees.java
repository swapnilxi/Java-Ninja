package JavaDSA1;
class TreeNode{
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value ){

        if (value ==data ){
        return;
        }

    if (value < data){
        if (leftChild== null){
            leftChild= new TreeNode(value);
        }

        else {
            leftChild.insert(value);
        }
    }
  else{
      if (rightChild== null){
          rightchild = new  TreeNode(value);
      }
      else {
          rightChild.insert(value);
      }

  } 
}


public class Tree{
    private TreeNode root;
    public void insert(int value){
        if (root== null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }
}

public class binarySearchTrees {
 public static void main(String[] args) {
    private TreeNode root;
    Tree intTree= new Tree();
    intTree.insert(25);
    intTreee.insert(20);
    intTree.insert(15);
    intTree.insert(27);
    intTree.insert(30);
    intTree.insert(26);
    intTree.insert(22);
    intTree.insert(32);


}
    
}
