class Loop 
{
public static void main(String[] args){


Loop lp = new Loop();

lp.digit(9697);

}
void digit(int num){
    int sum = 0;
    int digit = 0;
    while(num>0)
    {
//       System.out.println(num%10); 
        int rem = num % 10;
        sum = sum + rem;
//      digit = digit + 1;      
        num = num / 10;    
    }
//System.out.println("digit:"+digit);
System.out.println("Sum : "+sum);

}

}
