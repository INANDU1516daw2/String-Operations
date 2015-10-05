package stringOperations;
import java.util.Scanner;

public class EntradaDeTeclado {
    //Campos Objeto
    private String entradaTeclado;
    private char[] charArray;
    private int[] intArray;
    private int[] stringToIntArray;
    
    //Metodo Constructor clase
    public EntradaDeTeclado(){
        entradaTeclado="";
        pedirEntrada();
    }
    
    //Metodos Objeto
    public void pedirEntrada(){
        Scanner scan = new Scanner(System.in);
        entradaTeclado = scan.nextLine();
    }
    public String getEntrada(){
        return entradaTeclado;
    }
    public int getLongitud(){
        return entradaTeclado.length();
    }
    public char[] convertStringToCharArray(){
        charArray = entradaTeclado.toCharArray();
        return charArray; //return the char Array
    }
    
}
