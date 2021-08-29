package currencyConverter;

// udemy coding challange 1 - Currency converter - Java in Depth by Dhiru Mundluru

class CurrencyConverter{
    int rupee= 63;
    int dirhams= 3;
    int real = 3;       
    int chilean_peso = 595;
    int mexican_peso = 18;       
    int _yen = 107;
    int $australian = 2; 
    int Rupee= 63;

    void printCurrencies(){
    System.out.println("rupee: " + rupee);
    System.out.println("$australian: " + $australian);
    }

}


public class currencyConverter1 {
    public static void main(String Args[]){

        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();

        }; 

    
    
}
