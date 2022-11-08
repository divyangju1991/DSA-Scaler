package com.scaler.dsa.stack.homework;

import java.util.Stack;

public class InfixToPostfix {
	
	// A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    private int prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
            
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        
        default :
        	return -1;
        }
    }
 
    // Utility function to check if a given token is an operand
    private boolean isOperand(char c)
    {
        return (c >= 'a' && c <= 'z');
    }
 
    // Function to convert an infix expression to a postfix expression.
    // This function expects a valid infix expression
    public String solve(String exp)
    {
        // initializing empty String for result
    	Stack<Character> stack = new Stack<>();
    	stack.push('N'); 
        int l = exp.length(); 
        StringBuilder result = new StringBuilder();
         
        // initializing empty stack
        
         
        for (int i = 0; i<l; ++i)
        {
            char c = exp.charAt(i);
             
            // If the scanned character is an
            // operand, add it to output.
            if (isOperand(c))
                result.append(c);
              
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (stack.peek() != 'N' && stack.peek() != '(')
                    result.append(stack.pop());
                if(stack.peek() == '(') 
                	stack.pop();
            }
            else // an operator is encountered
            {
                while (stack.peek() != 'N' && prec(c) <= prec(stack.peek()))
                    result.append(stack.pop());
             
                stack.push(c);
            }
      
        }
      
        // pop all the operators from the stack
        while (stack.peek() != 'N'){
            result.append(stack.pop());
         }
        return result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new InfixToPostfix().solve("k/(z+z-m-z-l-v^w^u+y/a-o+y^e*u/n/o*p^d-i/z^b+m*y-c*e)+b+(e*j^k^c+y*q*i^t-r/d^d^b/m*x-n-h^e^f-f/m+w-w+k+s/t*l^m*d*q-u^p)-z^(v^n+h+o)-k*(p-i/m^l^y/x/z-f^a+a^k-q*o^s*y^u)*p*(p-j+r)+d/(w/a*e/s*t/r*w^f+i^p*v^b*g+t-y-a^w-h+n+x-b+d+p^a/f-q*z+m/e*g/h-b^k/e-r/j/w*v+f/t)*c-(y^c-z*b-b/j+q/s+n*o+p*j^u^m*s^o*d*l/y/p/c-l-n/y^p*n^n+l^u)-d^(o/m-y+b+j+k+u^w/m/m*f-b-m/d*w*o)/s-(z*h-y*l/o^f+i+j-y^z*n*b/g+s-x+j*f^g+a*r*s)/m-(a^r*a)-q-(u^e/p+m^t^w*r+y*y/t*z+x*h-y*p*y-b*u/g*o*b*e+p*u*m/v^i*j+l-g*c+k)-p*(v-i*z-x+x/o^p/q*a)*g^(r/n^e)*m^(m-j-i-f^y+f-h^o/a*k-j*i+h*r^d-i+v*e-y*q-h/c+k/x*c)-g^(u+b^z*m/p^d^f*i*y*b-i+s/m^g^d*p/i*n*i*j)-a^(d^f+j-x*t/b*w*c*a-l*o*w*l*j/h-l/o-p+v*f^f-d+c^j/n-i*r)/z-(w-i/q+u^w+v/c-d+e-v-d/i/z*n+x^r/j+h/b/g/l*y/s^h*i/y^j^p+v)+k/(m*h^e+k*n*q*e^q/b-v^j*m-g*t-e*i^a-r-c/x^f-f*e-e^e/e-p+v/i/g/a/v^c/b+d+o-c)+w-(q*k*z/l^b^u/f^t+z+c+x/e/d-b-r/c-o*c+p/y^o/x/x^s/q-g+w+y-q^k*u/p*p*h*g^o-z-r)+s+(g+r-k*q+s*e/d^a*g^q+w^h+j+j*g^v+l^o*h*u/i+m+m+p/o/d+k*c-a)/l/(v-x*t*h-b^h-p+w/o^z-i/f+s^j*e-e-d/k*o-b/f/v/k*t^g^g*z-w/i+w/b/k-y/y/h^t+a)*s-(t-n/j-o*l-t)/y*(b*w+s^n^p^g+z+j-g^i*z/s+n+j*u+c-s^u)-e/(g+k-a-c^f*z^a*i/l^h^h*s-q+d-n)+w^(d^k/y/y-n*u-g-s/v+i+k-t*d^d+f+p*b+o*n-n+j*n^r+k/u*k*k-g+t)-p+(l/g^i-r-k+m+u^m*n/h+w)-g-(w^l+t/n/g^b*o/k*f^k+s+v-t+c-i+s^p/w*u+x*k^s)/v+(q/p^n/d*r/v^m-h*g/w^i*z^x^j^o/x*d+a^x^g)-b/(c*m-c*j/q^l*u*u^r+e/a+o*z*y+c^c/b-w/e)/o^(q-g^f*j-w-r-m/q+d^x^m/j+i+o^q-m/p-j/j/t/l-v/x^i*j*c^q+n/y*g*b^r-s^l*w^s)/s+(i/h+a/k/a*c/w-b^w/s/h^r-t/j^w*z/w^j+s/v*w-b*f^z/x*a/a/u^l/p/y/d+b^y^q-m*b)-y*(r^c-m-q^v-g+q+s-s-y^f^h^i+n+b/s/z/z*x+c^t-f/m*j/g)-v/(i^e*b*j+n+y^g-o*e-j/z/d+v)/d*(g/w*j^t+z*j*x/u^j-n/l/q-w+i*c*f+u/w*v^h-l-a+v^a/x+e-w*l^p/k*t/n/f*n/o+u-v/v*h)+f-(g/v+q^a/v^i)/r*(y-f^k*o/c*l/t/j*h/f^l+x*a-g-q/p*k*t-w+l)*n*(s/m-l+o^e/z)^f/(r+s/e^k-d/j*c^x*v/c+c*o+m-z*g/o-y+m-t*e*y*m^z^m+s-c^t+g*o/d-o/s-w-h^r-b^r/c/g+z^i*r^f^h)*d-(z*d*g^a/d-k-d-b^r/w+e/r^b*k*u^q/n^k+w-w*w/c-f-i-h*d+g^h^x+y)+c+(l/c-l*q^z/y-g-x-f*s-f*c+t*l*r-z+z-z/p+k+o^k)^z*(d/t-v+a+w*n/c)-v-(e+n-p+x*t^x)/z-(i*u^i/o*s)/c*(p/p+w+e+j^u*e/v)*u*(v^l+k^y+l+m-z+f^r/y+f^q/h-d-b*g^q-q-d+z^r*g+n*q-h-e)^p^(g-p*c-t^v/q^f*p^j/a+t*h*q-z)-d+(q^j/e*n-o/z+b+o/u*y*p+w-h/h-h+k-t*h+s-o*e*t/a-a)*z-(r-s*c^s-h/e+u^f+f-p*j/p^o+t*q^l/p*v-y*a*d^n-a+c*w*u^o+d+a^w+e+g*p/r-j-e^e/i+t)^a-(i-g*y-y/n^z/j*r*a/o*j+d^s^w+c^t-j*u*d+l/p*l-x/p/c-j*b-h+z^h*r*g*b+w*a+q*y/c)-x-(p/t-g+d-z+b*z-e*d-t+h^i+x/d+u*i*s/c*f^n*v^c/u+b^c+h^b)+b+(v-m*m^m/b)-p*(x-s/i^y^v*l+d+o*u^n/e+b*y*z^p/o/e+a-i+a-d*m/y^s/o+e^n+t+t/r*c)-t+(v+t/g*w+g*s^t*j/q*p+c*p-l/g-a^y-s-i/t*z^z^x/m-p/l)-c-(o+l*g/e-z*r+f-v+r/e-y*f*d^x/i*w^g/b/n+t^a)^a-(s*o+n^y+j^b^f+f*n*s-u^f*p+g^d)-n+(a-v/g-b+i+w/t^x^g^g/k^i*p)+e*(x^y+l+w/h*q+a-t-v*t^l-c+y+p^u^b+u+l*d*s+w)^x+(e^i^r/m+r+b/n^n*b/m/m/t/s/b*i+l/o+k*r*q^t-r/t-d+v+e*b*s-w^x-e^l/u/t^w+h-s+k*x^b^i^z/y+j+l)*i/(y*y/d*u^l^t+e-x*v*v/j/v^u^r*j^o^j/y*y^r/c+d/g^o*o/f-t-d*m-l*s-k+e)+q/(c*s*n+d+w*i+c/i^f-u-b+n+t+o^t-j*k-e^i)+w^(x-j*w/e*s*p/j*t^w^d-v)+s-(u-q/z*c+a-v-c-g+s+y/d+s+e-u^n-s/s/p*v/r-n*v^z-q-e/e+v/p^f+e-l^p+h^w-b+f-b*c)/o*(y+n*a-k-r+v-n*t+e+i-r*v^s+c*m^f-s^s^p^l*x+x^p^e-t^x^r+w^z^l+i*i+v^p*x^z+v-j+e/p*z-t*f*j+w^t*v^x^h)*h*(h^w-y/x+e*i+o)+b+(f-b/v*a-i+j^p+e*n+k*m+h/u+p-n^u/t^d^k^a-e/a^q/y+n^i-z*x/s-a+a^t+b+t-z-t/o+r/v+d)^c+(t/z-h*a-i-f/h*j^s+u/j^d*z-x-l*x^i)-u-(s-c^k*w+y*y*l-t^z+c*x*t^z*h*e)*a/(o*o/u+b/w-z+o*g^f-z/m^v/d*i^s-x/l*x+u/c^n+l)+z/(j^j^e/v^o-h*b^k*z-x)^t-(t+p*z+a^f-m/q+w^p*i+g+c*n/d-d+c*i^m^p+k-g*f-c+v+n/d+x/p-c-f*g*g)*l/(u/e/k-n*r-b+n*j+o/m*w/p^t/g*v^s*y^f+j^u*e*h/e^k^u/o/b)+w*(f/z+o-y^g-v*w/q*p)*j/(s-e-n^d-e*e-z*p^g^w-y^x-t*g*b+w+g-g-i+x-r*f-i/i^e-d^e+p+e+b)+v-(k*i-i/g*g/l-c+e-g-o+b+l+z/e+b-l*y/q^c+u+s+k-l+y)^p-(i/o*s-z*r*f+a^k^c/n+b-o+w^e*g+r^k*t*e^m-s-p*c*c+z+p*e+e+y/j/j/r/i*z+i^g-f-s^b/n/p^y^z/z-g-g*t)*n+(m-m^j*x^g+v^w/u-p/s^i+z-m+h-m^h-s+v+v*g*d/d+a*d/g-c/c*d/k*r-m-u-i+g-m^l+n^w*j*o-e+b+b)-g/(f/n^y/y^x-r^g+t*d-s+j*g+l^e-a+x*u*r+w-z*t+z/a+s-d-o*j+p^e+k*q^x-h-c^n/j-d+k-i*w-u^k*d-l*u+p/a^w)/v/(y*y*m-o+f+c)/i+(a+x^b+k/l-k*q/b*u/i*s*v*l/p+q-k*z+i/c+n-p+e*o^x*s/s-u+q^a+u-r^w)*n^(p/u^r/g/p^k-b*t*j^k-n+w/f*d/r^r^o/x-k+g^o-m*t)-g^(i*x+z+m^y-w-o^f-f-y*g^n^p/b*a^f+s)/z-(n+w-c/e^y^v/m+w^z*y^g-s*v*g/a^d-h-v/e/j-p)*q+(w*q/d+e-y+w/i*r^a*k+g*l-a+n/f+b^o+v/r^n+u/m/g^x*k+x-f+h-y-h^s-h+o+m/s+q+j*t-v/a-d*h*a+r^h-w-t/z)+e-(r+u-b+y-a*s-m-g-w/l+a+q/h-l+x*a-a+r-o-n^x+r^l^f^b/f*r/w-a+a^y+q-h/e-g+i*q^x+a/w^r)^l-(z^g-v+r^h*o-b/b*c+q-u*e*u/s-u/k/c^j/l^i^c/u/z^h+j-z^l-w^i^d^a*e^o+e^g+m*c-v/o-u*z*c*i-e/z*n^s+w+v)*n+(n-n^c^j+u-e^c^b^m-k*a/e+a-e-a+n*r*c+m*m*o^z/i/w*u+g*j-m-r*t-b+h-c+l-p-t^n*u+s+a*m/s-j+t+b*y^u/l)^d^(c*o-x*c+b)/l^(f*q*t*o/h+j*e^r^n)/g+(n+a/z+t/q*w/a/p/k-p^z)+h^(m*j+o-f+f*b/e-c*h/r*y*l^v-b^d+h+m/w*l^j*d-u+m^f/l^e-d-w-u-g/b^b*j-z*l+d^a^z^m-l/x)/r+(z*o+z^o+g-v/i/i*z^t*k-l/n-m*l-h^w*d*u+c-q*f/s)/j^(v/k^l/d+o/z^d-p+q)+q+(g*u-b+a*a-n*a+a*j*y^r*q/g+o/i+q+x+f/p-z/d/x/u-f+y+b*v+x^a-g+v^x-m^m-n^z/x+m-s/d+y^e-x)*d+(h^t+w^n-e/s-p*o-z+e*u-m-d-w^w/x/e^y/n+a-f*z-j-c/i-b+h^b-d*t)+f+(t-i-l^s+e^l+m-a+f-y+w)*j+(m+c*l/u^j/w-k^t-l^f)^q-(g-k*o-f+i-j/n*w^g*c-j*v/e+d^d^t+t*x)^o-(z^d/v^f-c+r*n-x-r+s*k/f*q/o*w/s/x/k^m*g+a^q^d^i^m+a*m/z*t+m^y^i*a*a^e^j+e/g^n)+t/(j-d*s^j*k-j+s+y+w^l^v*w+j/d/l/j+t*p*e-w/k/c*v/x^f^n-n)+r*(m*p/a^x^v+h/g-p-b/d*n/r+j+l^m*j-u-t-u-w-w^e+r^q^f-t*g^j/y/w*j^x-d/k*k*p)^e-(t+q*y-k+t^i*j*c^g/j-n*r^n*d+x/g*a^s/z+t*e+c-s+y-k^i*o-w/p*z-r-x+w/s-v+d+m-p+z/e+r-l-u-c+s-v^f)-m^(g-v+t*g+p-t^w-d*b^k-e-d/s*p-t*b+q^z*f/n*k/l^a+l/z^f/s*z-w-d+k^q*z*d*t-b+p-r^j/o-r+a-c*y/g^p-q*c)*i*(l^x*r+j*d^k*t/s-c-t-y*a+n+t/l*i+g/p^l*y*i*d+w)^h-(h/q-p/b+s*i/q^y*b/e+d)+t*(y*m/i^t^o*u/y/m^x^d+u+c^z*u/g/u+k^s/f^n-c*a/k/g^t^v^b*b)+s-(j-i+h/y^l^n^q+j/f^s^g/e+c*g+t*c^n/i+b/v+k*h^b+w^p+v+u/e-v+h+o/r/o+y+h-q*o^m*v*p/p)^d+(y+f)*u*(n-x-l*o*j^g*k/v+m+d*l-b^f)+d-(a^b/y/g*r+i*s*s+b+n/n-s-z-l^r^c-f+r^v/w^z*d^l*i-z-s+q/l+r*g^r^n+g*e*p*u/p+c-r+k*c)*z/(r/t+e/t/v+n-u-t-h*w+v-d-g^l-i*z+s*w^x+l/b-w+s-u/v*e)-u/(l/e/z+r-z-w/a-q*r^q*k+t+c*k^e-c+j-j^r/e-j/v*m-w^y/t+e*p^n*p+f*p+p-z+b/b/c+w/v)*k-(u^u*q*n^w+x*i/m-i+f+a*u-p*c-k+j-y/i/l^g*g/w-b*z/q*a/h/x*a+y^j-r+f/i^p*r)/x^(u/s-l+d+b-r-t-v+k-x^z-j/l*x*j*u+t*o+j*r*r/s+b*t^b*a)+d^(z-q-x^z^a-b-k/n-b*w+e-s^e*y^g*o-f*r*z^h-x^q-h/q/k^c^e*r*j+h^c^c^d^a/u^f*o/z^g^f^v/l*e/e*q*o^f-y^i/k*g)-e/(w+x+q-y*h*a/x+a)^x*(u/e-k/t*a/t^m*t/l-s-r/p+t-n^e/q^w*h/v/t+i+w^m+f^a^e+s^j^b-d)^s^(k/u+l/f-x*x^n/y+s-y-w^o-j^p+r+m*y^j*s+s+u+m+e/a-w-a^i/c/b^e-u)^h-(o/b*a*c/s-m*m/g^i-a^w^v*k/w*v-a/x/n/o/b-i^q-u/f+i^s+h-o-m^v^c^c*n-v^y^i)+w^(u*x-z+f-d*q/p*y-j^d)/t-(d*v*y/j-l*g/g/h+p^f/y*i+p+u^x*c*l-q^u-q/n+l^s^j^e+z^k*i*s*x/m/c)*h*(u/g*j^r-z+z^q/f-l*r+x+y^t+v/a*q+f^p-q+y-x^a-h/z/o*e*s*f+n+v-z)+b+(h*q^j*w*i+k+b^i*t-o*t*o-w+b/c-x-c-i/c/y^m^w+c+v*g/h/z*g+v/o-k/b^q+c+w^v^e+x-n)-l+(y-o-q*d-j*j/w*x/t-g^a*a^x^q^e-j*x^a^s^h*r)-a-(j+s/j*b*h^v+a*o*l*p+k^b^c*t*b^y-o^u+u^j+j+k+w/k+e^h-i/x+o^a^a-q*j^k-l/r-l*h+q/q/q-m^h^n*j/m*w)-o/(j-z/r-p-w*x+x-d^l-o+h/e+j*e/g^j/x/q/m*j*f+g-e*s/s-n+w+l*d/p-z^u^k-f^f-m^u^p-b+z-u/q)^e*(s-y/u*a^r-a+b/h^i-i*b-x^x/m/z^n*u*o-k*g+g*u/c+p+l^u/q*z-w/c*k^o)+j-(k/w+y+m-n+b-n+u/o^d^d+u*w-e*e^d+b-j^o/w^e-x*h^o-r+m/z+r/y/e+q^v/b/p)/k*(g*g^q/z^d-l/h^z-i^m/s-s+r+e-c/u^n^w*n^v-k^c+i*m^s+o^p+h-r-r+i/s-f)/h*(u/o+e-j^n/g*e-x^r^b+b^e^j-g+i*k/v^n^e^k-g-r^n^x)+w+(g-s/j*y*h^b-a^y*t*g^c/a*w*r-z-f*r^s-q-o-i+t-q-a/a-v*x^u*o/p^r*v*k+b-r/t+z+v)*y+(x+n-w+w*n+h/h*m)/h-(s+f*g-l+s^l+o/n/y/d-w+c-f+d-v/s*r/e/k*z/l-g+r*p-o/l-h)*x^(f/h/u+y*n-w^o-j/l+n-v^c/f*h-o/s-h^v-h+r-u/y+l^t^u+q/h*v+h^t^e-w+k/t/r+w/k)*t*(h*b/p+h^k/p-k^k^d+p-y^l+j+k-p*d^j^z*t^v*p/k^x/n^u^l*z^g*m/i+w^r^y-h)^r^(h^r*e*d*e/k/n*a+y+x-s^m^h*c^k-e)+c*(e/a/w+g/z/d-p+v^s^j^i^t-a^k)/u-(e-q+m/e+t/p-d*g-t^k^p/e*l-j*c+u)/p-(r*o/v*k*u-a)^w+(c/k/s/t*x/o+x*h*c*c+i-p^i^t+w*p+k+t)+i^(n*w/a*z^f*v*j/m-z)-u*(d+q^x-t-b-i+n-p/v/s/n*p^i-x/h/b*j-x-p*j^q/p^i^o-j)/p+(o^l/t/n*j+k*k/r*a-k/z*h+p+l+h/h*i-m/l-e-c*i+z*q^v*t-s+e/n*n+o)-h*(f-o+o*k-w+v*a/h+l/g^d*r)*g^(o/g+y*f^b*q*u/t*a/b-h/l/t^j+p+k/q*w*q-v^j/o/d-s/b+l-w*v+r^j-p-h+k^u*q*b*d)-o+(c^x/v*n^v*w*n^x^g-e*t-p^h-v+a-z*z-k-g^y+y*b-z*t^y*n+s+w*m+u/f^n/n+d)^r^(u*u^i+b*n-d+f/i*v+u/d^k*c+v-p*z^x/z^c+f-f^q/o/c^d*v/d*h*z+d-z-y^d-z/q^y/w-m+p+o^z-z-k)/y/(z+y^k*f^p-j*r-x/j-c*d/f+k/u-y-w-p^d^s+m+o^x+c/b+b*c+d^k^f*o-x+o*h)^b-(c/r+s/j^b^b+i*z*b^z^b)-f/(p+g-n+s^a^q*l^f-i^k*j-l+o/n-n*q^e-e-x/p^k*d+e/a^r*s/o/r+x+y+k*w*k+p*a-z^t/j+v*s/i-l^u^g+l/u*z^w/h/k+i)/a+(x+r-u*w+z/e*c/m*e^g+j+c/i^z-c/g-u/r*e^w/k-k-y+m*s-p*x-q-c^v+d*f/f+p/v-g/g-m+l-n+g/n-h*p+t/f*b+o/a-y-u)^c+(v^x/e*z+o^i*p/p+q+o/e*m-f+r^g+n^s+x-i-y)^p^(e^k-l+y-v-w/q+u^d+j/b+i*p*c^u^f-m-b*z*a^e+w-f+m/s*l*p^u/w)^a*(d^e-p/l^u*v-e-z^j)^z*(f*j*b^l+d*p/p*y/r/p+c/g/o-n*c+x*a/h+g*d+n/c^t-j+s*g*s/c-b+b/z+r+u-v/b*p/m-u+s-h^g+h-l/z)+y-(v-b^f+o/t+h*x^g*c-a+m)-z/(t-c+q^s-o+s)/e^(p*d*r^n/d^x*j-e-a+c^x/v/x-a-x)*u/(r^j^v^v+l*q^q*v+x*j^x-n-f+s+p/a^z^u*m*s+z*k/a/o^s^n-r^a/c+q/z/v/j-b+r-e*u-f/t+u+q+w/l-c^h*o/o/y*n^l/a)^q-(b+t/l/j+w+n-t/y^r*b*x+j+k/d+x+a^y/h*f/g+z^q/l^r+y^u)^m+(z*l*g-w/z*f+d-t*g+t^r)+e+(y+l^q)+v^(x^x+l*r+q+f/e/o/b/s-m^d-q^h^t*i^j/w^n+w/v*q+j-u+x^i*m-n^h*z)/o*(s*b+x/c+q+y*s-s-a*f+e*v^y^j-u-u-l+w+p^b^p*j^f*g*y^c*i+e^q-m/v^p+x^h+o-i*n*d*e)/h^(e*q*d^a+g-f-h-q*q+r-v+s-d^y/r/u+j-s^f^o^x/l*y+z^c/y-r^i)/g^(r+a*y^s+s+n+p+f-h^w/m/q+u+h*i*b/r+x-e-v^b/d+c-v^a/w/i*q-y^m-t*a+d+p*g+g+w-h/h/z^l/k*y-s*q/z-h^x^k+f)*e/(d-o*g*x*f+w^i^z-f^p+u-k^u+a-d*o/b/u-t*a*d-s+w-c^h/r^g+f^f+e/l/t*m-g-f^q^r+b*d-x*f+i/x)+y^(p/z-u+w+f+d*m-m/n*q/p^b^m+t^s-y)+z*(g-r/p*h*j-u/t*i+u*q+y/y*p*b+b*y^s*c^x+g-y/z/s^j+p^v+u-h/s/t+l+o/m*y/y^j+p-r/e*f+r*w)-a*(w/y*d^k-p+g*f)/q^(s^x-f/x+i-c+f+p+s-q*m*g^g-i+a-a/b*k+q)-d/(v-g-u^l+v+o^p+b*c^g-a^q*r+e+s+b*a^o-d/b-y^o/f-y^c-n-h+s)*c/(w*d-n/l-n*i+u/s-p*l+n*y/l/k*t-t^w^o^k+b*y-v/a^m*j*c/t/r^a/w-p-v/n^n^d-z^j*k)*r/(d*t/l-i-f/h*n*y-e+a-w-h+y*p*y*o/t+i+t)^l/(u^m*f-p-z)^i*(y^p+r/u*t*s/k^s+e+v+o)+w+(j/k^t*q-c/d-q*t-i*s/y-y+j^d^s^y/b-d/v-o^k/c*z/l*p-j-h/v/u-y+b/r^b^l^n-z+f*p+m-v^y*j-b/e-y^p+i*g*w+u)^p/(j/w-p-s+g-y^w+g*y^d*l^f^v*p-f+s+e^a-s-u)-b+(p*b^k*o*f/y+e-r*s/q/x+q^b+x/g/w/g/h*r/w^p/n+y^v*o*w*t/y/o+g+g-o+e+c*d-k/o/u-d^z*i/x^d-d*v-b^f+j/c)-i/(q+k*s^p/x-f^w+l^u+c+k+e+y/z^z-b*r+i-b-t-o-b/o^v)/f+(l+p-h^a^w*i+n)+h+(j*w^f/s+w/b^k^z*k*o/e-y-o*d*p^n-x*w/x-h^j^q^a+a+p^a-k^h-a-q-x-e-d/k*w*c*t+c)*g^(h-r+k/v*j-p-g)-a*(l-p+a/v^k^x*o^p-i*l/p^w/g*r-o-i+y*e/j+l^q-g*e^w+i*"));
	}

}
