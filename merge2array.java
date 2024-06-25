import java.util.*;

public class merge2array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        int []b= new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int[] c= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<n){
            c[k++]=a[i++];
        }
        while(j<m){
            c[k++]=b[j++];
        }
        for(int l=(n+m-1);l>=0;l--){
            System.out.print(c[l]+" ");
        }
    }
}
