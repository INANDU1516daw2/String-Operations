package stringOperations;

public class stringSplit {
    
    public static void main(String args[]){
        
    /**   Java String class defines following methods to split Java String object.
     *   String[] split( String regularExpression )
     *   Splits the string according to given regular expression.
     *   String[] split( String reularExpression, int limit )
     *   Splits the string according to given regular expression. The number of resultant
     *   substrings by splitting the string is controlled by limit argument.
     */
    
        String str = "uno dos tres";
        String[] strSplited = str.split(" ");
        
        for(int j=0; j<strSplited.length; j++){
            System.out.println("strSplited["+j+"]: "+strSplited[j]);
        }
        
    }
    
}
