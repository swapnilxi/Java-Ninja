
class base1{
    int x;
    base1(){
    System.out.println("this is base consturctor ");
    }
    base1(int a){
     System.out.println("this is base class overloaded constructor having value of a: "+ a);
      
    }
    
    public void setx(int x){
    
        this.x=x;
    }
    public int getx(){
      return x;  
    };
}

class derived1 extends base1{
    int y;
    derived1(){
        System.out.println("this is derived class consturctor");
    };
    derived1(int a , int b){
        super(5); // if we want to access anyother overlodaed method first
          //then we will use super(value) keyword in derived class
     System.out.println("this is derived class constructor with value of b: "+ b);
    }
   
    
    public void sety(int y){
        this.y=y;
           }
    public int gety(){
        return y;
          }
    
}
class childofderived1 extends derived1{
    childofderived1(){
    System.out.println("I am child of derived");
    }
    childofderived1(int a, int b,int c ){
    super(6,7);
    System.out.println("I am overlodaed child of derived having value of c :"+ c);
    }
   
}

public class inhertenceinCons1
{
	public static void main(String[] args) {
	  // creating object of base class
	    base1 b = new base1();
	    b.setx(4);
	    System.out.println(b.getx());
	    
	// creating object of derived class
	 derived1 d= new derived1();
	 d.setx(43); 
	 System.out.println(d.getx());
	  d.sety(42); 
	 System.out.println(d.gety());
	
	 
	 //creating child of derived
	  System.out.println("child of derived is: " );
	 childofderived1 cd= new childofderived1();
	 childofderived1 cd1 = new childofderived1(14, 15, 16);
     cd.getx();
     cd1.gety();
     

     
	
	}
}
