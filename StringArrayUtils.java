 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if(s == value) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i;
        String hold;
        
        for(i = 0; i<array.length/2; i++){
            hold = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = hold;
        }
        return array;
    }

     /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        for(i=0; i<array.length/2; i++){
            if(array[i] != array[array.length-i-1]) return false;
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == value) count++;
        }
        
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int j = 0;
        String[] stringArray2 = new String[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i] == valueToRemove ){
                
                continue;
            }
            stringArray2[j] = array[i];
            j++;
            
        }
        return stringArray2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] a = new String[array.length];
        int j = 0;
        for(int i=0; i<array.length-1;i++){
            if(array[i+1] == array[i]){
                a[j] = array[i];
                i++;
                j++;
            }else{
                a[j] = array[i];
                a[j+1] = array[i+1];
                j++;
            }
            
        }
        
        return a;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        String[] newStr = new String[array.length];
        String add;
        for(i=0;i<array.length;i++){
            
            add = array[i];
            for(j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    add += array[i];
                    
                    
                    count++;
                }else break;
            }
         
            newStr[k] =  add;
            k++;
            add = "";
            i += count;
         
            count = 0;
        }
        
        return newStr;
    }


}
