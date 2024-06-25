public class sumofnumbers {
    
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="tha2runvi5kasi4t";
		char[] arr=str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		    if(i!=0 && i<str.length()-1&&(arr[i]>='0' &&arr[i]<='9'))
		    {
		        if((arr[i-1]=='a'|| arr[i-1]=='e'|| arr[i-1]=='i'|| arr[i-1]=='o'|| arr[i-1]=='u')&&(arr[i+1]=='b'|| arr[i+1]=='c'|| arr[i+1]=='d'|| arr[i+1]=='k'|| arr[i+1]=='f'||arr[i+1]=='g'|| arr[i+1]=='h'|| arr[i+1]=='l'|| arr[i+1]=='j'|| arr[i+1]=='m'||arr[i+1]=='n'|| arr[i+1]=='p'|| arr[i+1]=='q'|| arr[i+1]=='r'|| arr[i+1]=='s'|| arr[i+1]=='t'|| arr[i+1]=='v'|| arr[i+1]=='w'|| arr[i+1]=='x'|| arr[i+1]=='y'|| arr[i+1]=='z'))
		        sum+=Character.getNumericValue(arr[i]);
		    }
		}
		System.out.println(sum);
	}
}
