import java.util.*;
class hourglass {
static int Sum_hour_glass(int r , int c , int[][] arr){
if(r<3 || c<3 ){
 System.out.println("Invalid row or column value must be atleast 3");
 return 0;
else {
int max_sum=0,sum=0;
for(int i =0; i<r;i++){
for(int j = 0;j<c;j++){
sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1]+arr[i+2][j+1]+arr[i+2][j+2];
max_sum = Math.max(max-sum,sum);
}
}
}
}
return max_sum;
 }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of rows");
int r = sc.nextInt();
System.out.println("enter the number of columns");
int c = sc.nextInt();
int arr[][]= new Int[r][c];
for(int i =0; i<r;i++){
for(int j = 0;j<c;j++){
arr[i][j] = sc.nextInt();

}
int result = Sum_hour_glass(r,c,arr);
System.out.println("Sum of hour_glass elements is: " + result);
}
