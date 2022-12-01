public class Main
{
public static void bubble(int a[]){
    int n=a.length;
    int temp,j,i;
    for(i=0;i<n-1;i++){
        temp=0;
      for(j=0;j<n-1-i;j++){
          if(a[j]>a[j+1]){
          int t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
          temp=1;
        }}
        if(temp==0)
        break;}
    
}
	public static void main(String[] args) {
	    int arr[]={3,2,4,1,8,0,15,322};
System.out.println("Before Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
bubble(arr);
System.out.println();
System.out.println("After Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
	}
}


/*
Output:
Before Insertion Sort
3 2 4 1 8 0 15 322 
After Insertion Sort
0 1 2 3 4 8 15 322 
*/
