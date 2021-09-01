package currencyConverter;

        //int rupee= 63;
        // int dirhams= 3;
        // int real = 3;       
        // int chilean_peso = 595;
        // int mexican_peso = 18;       
        // int _yen = 107;
        // int $australian = 2; 
        // int Rupee= 63;

    class CurrencyConverter2{
   // double [] exchangeRates={63,3,3,595, 18, 107, 2};
   double[] exchangeRates;

    void setExchangeRates(double[] rates){
        exchangeRates= rates;
    };
    double getExchangeRate(int arrayIndex){
        return exchangeRates[arrayIndex];
    };
    double computeTransferAmount(int arrayIndex, double amount){
       return amount * getExchangeRate(arrayIndex);
    }


    

    void printCurrencies(){
        System.out.println("rupees: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("$dollar: " + exchangeRates[exchangeRates.length-1]);
    }

}
public class currencyConverterA {
    public static void main(String Args[]){
    
       CurrencyConverter2 cc= new CurrencyConverter2();
       //jan 1st 
       double[] rates=  {63,3,3,595, 18, 107, 2};
       //we can only declare statement like this, in assignment we have to use new keyword
       cc.setExchangeRates(rates);//sending argument 

       //jan 2nd
       rates=new double[] {65,5,5,597, 19, 104, 4};
       cc.setExchangeRates(rates);
     cc.printCurrencies();

    double amount= cc.computeTransferAmount(0, 1000);
    System.out.println("total transferred amount:" + amount);

    }
    
}
