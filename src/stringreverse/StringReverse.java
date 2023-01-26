

/**
 * This class +++ Insert class Description here 
 *
 * @author Rajveer Singh
 */
import java.util.*;
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        
        String name = sc.nextLine();
        
        char[] arr = new char[name.length()];
        for(int i=0; i<arr.length;i++)
        {
            arr[i] =name.charAt(i);
        }
        
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
        
    }

}
