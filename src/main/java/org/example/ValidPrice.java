package org.example;

public class ValidPrice {
    public static void main(String[] args) {

boolean isValidPrice = checkPrice (2,3);
boolean isValidPrice2 = checkPrice (10,3);

/*if (isValidPrice){
    System.out.println("This is Yes");
}else {
    System.out.println("This is no");*/
    if (isValidPrice|| isValidPrice){
        System.out.println("yess");
    }else{
        System.out.println("noo");
    }
}

    private static boolean checkPrice(int number1, int number2 ) {
        if (number1 > number2){
            return true;
        }else {
            return false;
        }
    }


}
