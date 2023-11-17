public class Myself
{

public static void main(String[] args){

Myself cake = new Myself();
cake.reverse(9697);

}
void reverse(int num){

 while(num>0){
   System.out.println(num%10);
    num = num / 10;
}

}
}
