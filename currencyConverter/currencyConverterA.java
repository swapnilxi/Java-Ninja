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
   String [] currencyNames;
   double[] exchangeRates;
   
    void setCurrencyName(String[] names){
        currencyNames= names;
    }
    void setExchangeRates(double[] rates){
        exchangeRates= rates;
    };
    double getExchangeRate(int arrayIndex){
        return exchangeRates[arrayIndex];
    };
    double computeTransferAmount(int arrayIndex, double amount){
       return amount * getExchangeRate(arrayIndex);
    }

    
    //  String getCurrencyName(int arrayIndex){
    //      return getExchangeRate(arrayIndex);
    //     } 

    void printCurrencies(){
        System.out.println(currencyNames[0]+ " " + exchangeRates[0]);
        System.out.println( currencyNames[1]+" " + exchangeRates[1]);
        System.out.println(currencyNames[currencyNames.length-1] +" " +exchangeRates[exchangeRates.length-1]);
    }

}
public class currencyConverterA {
    public static void main(String Args[]){
    
       CurrencyConverter2 cc= new CurrencyConverter2();
       String[] names={"rupees", "dirham", "real", "chilian peso","mexican peso", "yen", "$australian Dollar"};
       //jan 1st 
       double[] rates=  {63,3,3,595, 18, 107, 2};

       //we can only declare statement like this, in assignment we have to use new keyword
       cc.setExchangeRates(rates);//sending argument 
       cc.setCurrencyName(names);
      

       //jan 2nd
       rates=new double[] {65,5,5,597, 19, 104, 4};
       cc.setExchangeRates(rates);
     cc.printCurrencies();

    double amount= cc.computeTransferAmount(0, 1000);
    System.out.println("total transferred amount:" + amount);

    }
    
}
