package GeekBrains.SearchForPrimeNum;
import java.util.*;

public class SearchForPrimeNum {
    public static void main(String[] args)
    {
        int maxNum = 50;
        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        int f = 0;
        for(int i = 2; i < maxNum; i++){
            for(int n = 0; n < primeNum.size(); n++){
                if(i % primeNum.get(n) == 0){
                    f = 0;
                } else {
                    f++;
                }
            }
            if (f == primeNum.size()){
                primeNum.add(i);
                f = 0;
            }
            f = 0;
        }
        System.out.println(primeNum.toString());
    }
}
