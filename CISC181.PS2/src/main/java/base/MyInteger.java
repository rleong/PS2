package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger {
	
	static int iValue;
	
	public int getValue(){
		return iValue;
	}
	
	public void setValue(int value){
		MyInteger myInteger = new MyInteger();
	}
	
	public static boolean isEven(){
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(){
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(){
		for(int i = 2; i < iValue; i++) {
	        if(iValue%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean isEven(int x){
		if (x % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int y){
		if (y % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int z){
		for(int i = 2; i < z; i++) {
	        if(z%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean isEven(MyInteger myInteger){
		if (myInteger % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger myInteger){
		if (myInteger % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger myInteger){
		for(int i = 2; i < myInteger; i++) {
	        if(myInteger %i==0)
	            return false;
	    }
	    return true;
	}
	
	public static boolean equals(int i){
		
	}
	

}
