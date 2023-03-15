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
        //handles full operation
        if(isFull()){
            int[] temp= new int[data.length*2];
            for(int i: data){
                System.out.print(i);
                temp[i]=data[i];
            }
            //copied data in temp
            data=temp;
        }

        //the scope ot temp is over here
       //we know array is not full at this point 
       return super.push(item);

       }
    
}
