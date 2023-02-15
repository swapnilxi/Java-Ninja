package Stacks;


public class StackMain {
    public static void main(String[] args) {
        CustomStack customStack= new CustomStack(4);
        customStack.push(34);
        customStack.push(36);
        customStack.push(22);
        System.out.println(customStack.pop());
        CustomStack dynamicStack= new DynamicStack(4);
        dynamicStack.push(11);
        System.out.println(dynamicStack.pop());

    }
    
}
