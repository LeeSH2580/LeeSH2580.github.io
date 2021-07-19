package week14_theFinal;

import java.util.Scanner;

public class DoorHackingTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        DoorHacking hack = new DoorHacking();
        
        int countStrong = 0;
        int countWeak = 0;
        int countDigit = 0;

        String code = sc.nextLine();
        char [] letsDecode = code.toCharArray();

        // Some Code here.. 
        for (int i=0;i<code.length();i++) {
        	if (hack.isEndCode(letsDecode[i])==true) {
        		break;
        	} else {
        		if (hack.isStrongCode(letsDecode[i])) {
        			countStrong++;
        		}
        		else if (hack.isWeakCode(letsDecode[i])) {
        			countWeak++;
        		}
        		else if (hack.isDigitCode(letsDecode[i])) {
        			countDigit++;
        		}
        		else if (hack.isClearCode(letsDecode[i])) {
        			countStrong = 0;
        	        countWeak = 0;
        	        countDigit = 0;
        		}
        	}
        	
        	
        	
        	
        	
        }

        //      

        System.out.println(hack.decodeCode());

        sc.close();
    }

}

interface DoorChecker {
    public boolean isEndCode(char code) ;   // Checking End Code
    public boolean isClearCode(char code);  // Checking Reset Code
    public boolean isWeakCode(char code);   // Checking lower case code 
    public boolean isStrongCode(char code); // Checking upper case code
    public boolean isDigitCode(char code);  // Checking Digit code
    public String decodeCode();             // return decoded code
}

class DoorHacking implements DoorChecker {

    // Code Here..


    @Override
    public boolean isEndCode(char code) {
        // TODO Auto-generated method stub
    	if (code=='!') {
    		return true;
    	}else {
    		return false;
    	}
        
    }

    @Override
    public boolean isClearCode(char code) {
        // TODO Auto-generated method stub
    	if (code=='~') {
    		return true;
    	}else {
    		return false;
    	}
    }

    @Override
    public boolean isWeakCode(char code) {
        // TODO Auto-generated method stub
    	if ((int)code>=97 && (int)code<=122) {
    		return true;
    	}else {
    		return false;
    	}
    }

    @Override
    public boolean isStrongCode(char code) {
        // TODO Auto-generated method stub
    	if ((int)code>=65 && (int)code<=90) {
    		return true;
    	}else {
    		return false;
    	}
    }

    @Override
    public boolean isDigitCode(char code) {
        // TODO Auto-generated method stub
    	if ((int)code>=48 && (int)code<=57) {
    		return true;
    	}else {
    		return false;
    	}
    }

    @Override
    public String decodeCode() {
        // TODO Auto-generated method stub
        return null;
    }

}
