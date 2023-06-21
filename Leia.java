import java.util.*;
class Leia{
    private Scanner scanner;
    
    public int msgInt(String msg){
         System.out.println(msg);
         return scanner.nextInt();
    }
    
    public String msgString(String msg){
         System.out.println(msg);
         return scanner.next();
    }
    
    public double msgDouble(String msg){
        System.out.println(msg);
        return scanner.nextDouble();
    }
    
    Leia(){
        scanner = new Scanner(System.in);
    }
    
}