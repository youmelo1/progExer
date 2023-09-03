import java.util.HashMap;
import java.util.Map;


public class RomanoDecimal {
    public static void main(String[] args) {
        Map<Character, Integer> valores = new HashMap<>();
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);
        romanInteger("MMIX", valores);
    }

    public static void romanInteger(String num, Map<Character, Integer> val) {
        int total = 0;
        for(int i = num.length()-1; i>=0;i--){
            if((i == num.length()-1)){
               total += (int) val.get(num.charAt(i)); 
            }else{
                if((int) val.get(num.charAt(i+1))>(int) val.get(num.charAt(i))){
                    total -= (int) val.get(num.charAt(i)); 
                }else{
                    total += (int) val.get(num.charAt(i)); 

                }
            }

        }
        System.out.println("Em romano "+ num);
        System.out.println("Em decimal "+ total);

    }
}
