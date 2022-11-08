package com.scaler.dsa.string.homework;

public class SmallestPrefixString {

	public String smallestPrefix(String s1, String s2) {
	    
        StringBuilder ans = new StringBuilder();
        char ch;
        int n = s1.length();

        if(s2 == null || s2.trim().isEmpty()){
            return ""+s1.charAt(0);
        } else {
            ch = s2.charAt(0);
        }

        for(int i=0; i<n; i++){
            char tmp = s1.charAt(i);
            if(Character.compare(ch, tmp) > 0){
                ans.append(tmp);
            } else {                
                break;
            }
        }

        
        if(ans.length() == 0){
        	for(int i=0; i<n; i++){
                char tmp = s1.charAt(i);
                if(i==0 || Character.compare(ch, tmp) > 0){
                    ans.append(tmp);
                } else {                
                    break;
                }
            }
        }
        
        
        ans.append(ch);
        return ans.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SmallestPrefixString().smallestPrefix("tom", "riddlessss"));//
		System.out.println(new SmallestPrefixString().smallestPrefix("wixjzniiub", "ssdfodfgap"));
		System.out.println(new SmallestPrefixString().smallestPrefix("twvvsl", "wtcyawv"));
		System.out.println(new SmallestPrefixString().smallestPrefix("wixjzniiub", "ssdfodfgap"));
		
	}

}
