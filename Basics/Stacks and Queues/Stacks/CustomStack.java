package Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
   public CustomStack(int size){
    this.data= new int[size];//data array
   }
   public boolean push(int item){
    if(isFull()){
        System.out.println("stack is full");
        return false;
    }
    ptr++;
    data[ptr]= item;
    return true;
   }
public boolean isFull() {
    return ptr==data.length-1;
}
private boolean isEmpty() {
    return ptr==-1;
}
public int pop()  {
    if(isEmpty()){
          System.out.print("cannot be popped from empty stack"); 
    }
    // int removed= data[ptr];
    // ptr--;
    // return removed;
    return data[ptr--];
}
public int peek(){
    if(isEmpty()){
     System.out.println("cannot peek the empty element");;
    }
    return data[ptr];
}
    
}
