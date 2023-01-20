package com.xworkz.qu.things;

public class RemoveWhiteSpaceAndCountTheWhiteSpace {

	public static void main(String[] args) {
	     int count=0;
        String str="Hands on learning happens hear";  
        String s="";
        
        
        
            
        for(char ch:str.toCharArray())
        {
        	if(ch==' ') {
        		count+=1;  //count=count+1
            	
        	}
        	else {
        		s+=ch; //s=s+ch
        		
        	}
    
        }
        System.out.println("after removing spaces=  "+s);
        System.out.println("no of white space is= "+count);


	
	for(int i=str.length()-1;i>0;i--) {
		//if(str.length()>10&&str.length()<18) {
		char ch=str.charAt(i);
		System.out.print(ch);
	//}
		}
	
}
	}