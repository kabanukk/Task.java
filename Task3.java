import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int revers = 0;
        int mod = 0;
        int num = a;
        for(; a != 0; a/=10){
            mod = a%10;
            revers = (revers*10) + mod;
        }
        
        if (num == revers){
            System.out.print("YES");
        } else{
            System.out.print("NO");
        }
        
        
    }    
}
