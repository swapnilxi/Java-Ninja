package Stacks;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();//it will call custom stack
    }
    public DynamicStack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(isFull()){
            int[] temp= new int[data.length*2];
            for(int i: data){
                System.out.print(i);
                temp[i]=data[i];
            }
            data=temp;
        }
       //we know array is not full at this point 
       return super.push(item);
       }
    
}
