
class base{
    int x;
    base(){
    System.out.println("this is inheritance");
    }
    public void setx(int x){
    
        this.x=x;
    }
    public int getx(){
      return x;  
    };
}

class derived extends base{
    int y;
    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        return y;
    }
    
}


public class inheritance
{
	public static void main(String[] args) {
	  // creating object of base class
	    base b = new base();
	    b.setx(4);
	    System.out.println(b.getx());
	    
	// creating object of derived class
	 derived d= new derived();
	 d.setx(43); 
	 System.out.println(d.getx());
	  d.sety(42); 
	 System.out.println(d.gety());
	    
	}
}
