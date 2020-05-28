import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password :- ");
        String password = scan.nextLine();
        UnbeatableCipherCrypt obj = new UnbeatableCipherCrypt(password);
        //byte[] arr = password.getBytes();
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + ",");
        // }
        System.out.println("-----------------------------------");
        System.out.println("Your encrypted Password is :-   " + obj.encrypt());
        scan.close();
    }
}