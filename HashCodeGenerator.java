
import java.util.Random;
public class HashCodeGenerator {
    public static void main(String[] args) {
        //Instance Object Random
        Random random = new Random();
        //Set a Variable with object random 
        int index = random.nextInt();
        //Insert a Number of Characters
        int setNumChar = 40;
        
        //Array with Chars
        String[] charactersSet = {
            "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "1","2","3","4","5","6","7","8","9","0",
            "@","!","$","&",
        };
        
        //For loop to Print the Hashcode
        for(int i = 0; i<setNumChar; i++){

            //Set the Value of Random with size of Array
            index = random.nextInt(charactersSet.length);

            //New Array to store a hashcode with value same as number of chars 
            String [] hashResult = new String [setNumChar];

            //Index of Array based on "i" of for loop and the char selected by the var index random
            hashResult[i] = charactersSet[index];

            //Comand for print the Char stored in the index i number
            
            System.out.printf(hashResult[i]);
           
        }
        System.out.println("\n^^Hash With "+setNumChar+" Chars is Generated^^");
    }
    
}