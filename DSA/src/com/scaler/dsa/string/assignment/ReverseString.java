package com.scaler.dsa.string.assignment;

public class ReverseString {

	private void reverseWord(StringBuilder sb){
        int n = sb.length();
        int i=0;
        int j=n-1;

        while(i <= j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            ++i;
            --j;
        }
        
    }

    public String solve(String s) {

        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i = n-1; i>=0; i--){

            if(s.charAt(i) != ' '){

                StringBuilder current = new StringBuilder();

                while(i>=0 && s.charAt(i) != ' '){
                    current.append(s.charAt(i));
                    --i;
                }

                reverseWord(current);

                if(ans.length() > 0){
                    ans.append(" ");
                }

                ans.append(current);
            }
        }

        return ans.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
