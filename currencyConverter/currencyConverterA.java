package currencyConverter;
class CurrencyConverter2{
        //int rupee= 63;
        // int dirhams= 3;
        // int real = 3;       
        // int chilean_peso = 595;
        // int mexican_peso = 18;       
        // int _yen = 107;
        // int $australian = 2; 
        // int Rupee= 63;
    double [] ExchangeRates={63,3,3,595, 18, 107, 2};
    void printCurrencies(){
        System.out.println("rupees: " + ExchangeRates[0]);
        System.out.println("rupees: " + ExchangeRates[ExchangeRates.length-1]);
    }

}
public class currencyConverterA {
    public static void main(String Args[]){
    
        CurrencyConverter2 cc= new CurrencyConverter2();
     cc.printCurrencies();
    }
    
}
