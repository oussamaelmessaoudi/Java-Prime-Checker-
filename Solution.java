import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Prime{
    public void checkPrime(int... args){
        Arrays.stream(args)
                .filter(this::isPrime)
                .forEach(p-> System.out.print(p+ " "));
        
        System.out.println();
    }
    
    private boolean isPrime(int p){
        if(p<2) return false;
        for(int i=2;i<=Math.sqrt(p);i++){
            if(p%i == 0) return false;
        }
        return true;
    }
}
public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
        //Check overloading
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(!set.add(methods[i].getName())){
                overload = true;
                break;
            }
			
		}
        if(overload){
            throw new Exception("Error due to overloading");
        }
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

