import java.util.*;
class RomanToInt{
    public static int romanToInt(String s) {
        int res = 0; 
        for(int i= 0; i<s.length(); i++){
            
             int s1 = value(s.charAt(i)); 
  
            if (i+1 <s.length()) 
            { 
                int s2 = value(s.charAt(i+1));  
                if (s1 >= s2) 
                { 
                    res = res + s1; 
                } 
                else
                { 
                    res = res + s2 - s1; 
                    i++; // Value of current symbol is 
                } 
            } 
            else
            { 
                res = res + s1; 
                i++; 
            } 
        } 
  
        return res; 
    } 
            
     public static int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Roman Number:");
	String str = sc.nextLine();
	sc.close();
	System.out.println("The Numeric Value of "+str+ " is "+ romanToInt(str));
    }
}