package stringOperations;
import java.util.Scanner;

public class Program {
    
    public static void main(String args[]){
        System.out.print("palabra: ");
        //String object
        EntradaDeTeclado entrada1 = new EntradaDeTeclado(); 
        
        System.out.println( "entrada => " + entrada1.getEntrada() );
        System.out.println( "longitud => " + entrada1.getLongitud() );
        
        char[] arrayEntrada1 = entrada1.convertStringToCharArray();
        //printCharArray(arrayEntrada1);
        //searchCharFrequency();
        searchRepitedWords();
    }
    
    public static void printCharArray(char[] A){
        for(int i=0; i<(A.length); i++){
            System.out.println("arrayChar["+i+"]: " + A[i]);
        }
    }
    public static void searchCharFrequency(){
        Scanner scan = new Scanner(System.in);
        System.out.print("paraula: ");
        String s = scan.nextLine();
        char[] c = s.toCharArray();
        int l = c.length;
        int counter;
        
        for(int i=0; i<l; i++){ 
            counter = 0;
            for(int j=0; j<l;j++){
                if(j<i && c[i] == c[j]){
                    break;
                }
                if(c[i] == c[j]){
                    counter++;
                }
                if(j == l-1){
                    System.out.println(c[i]+": "+counter);
                }
            }
        }
    }
    public static void searchRepitedWords(){
        Scanner scan = new Scanner(System.in);
        System.out.print("frase: ");
        String frase = scan.nextLine();
        
        //split text to array of words
        String[] strSplited = frase.split(" ");
        
        // word repited array results
        int[] results = new int[strSplited.length];
        
        int counter;
        for(int i=0; i<results.length; i++){ 
            counter = 0;
            for(int j=0; j<results.length;j++){
                if(j<i && (strSplited[i].equals(strSplited[j]))){
                    break;
                }
                if( strSplited[i].equals(strSplited[j]) ){
                    counter++;
                }
                if(j == (results.length)-1){
                    System.out.println(strSplited[i]+": "+counter);
                }
            }
        }
       
    }
    
}
