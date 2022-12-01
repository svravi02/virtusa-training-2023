public class Main
{
public static void insert(int arr[]){
    int n=arr.length;   //n=4
    int temp,j,i;
    for(i=1;i<n;i++){
        temp=arr[i];    //temp=2
        j=i-1;          //j=0
        while(j>-1 && arr[j]>temp){ 
            arr[j+1]=arr[j];  //  4 1
            j--;      //-1
        }
        arr[j+1]=temp; //arr[0]=temp
    }
}
	public static void main(String[] args) {
	    int arr[]={3,2,4,1};
System.out.println("Before Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
insert(arr);
System.out.println();
System.out.println("After Insertion Sort");
for(int i:arr)
System.out.print(i+" ");
	}
}

/*
Output :
Before Insertion Sort
3 2 4 1 
After Insertion Sort
1 2 3 4 
*/

