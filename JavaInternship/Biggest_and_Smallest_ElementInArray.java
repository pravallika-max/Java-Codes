import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Biggest_and_Smallest_ElementInArray{
static void biggest_and_smallest(int[] a){
int small =a[0];
int big=0;
for(int i=1;i<a.length;i++){
if(a[i]>small){
big=a[i];
}
else{
small=a[i];
}
}
System.out.println();
System.out.println("Smallest Element in Array is : "+small);
System.out.println("Biggest Element in Array is : "+big);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of Array: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements into Array: ");
for(int i=0;i<n;i++){
arr[i] =sc.nextInt();
}
System.out.print("The Array Elements are: ");
for(int k:arr){
System.out.print(k+" ");
}
biggest_and_smallest(arr);
}
}