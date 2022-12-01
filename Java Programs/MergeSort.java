import java.util.*;
class Main{
    void merge(int a[],int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int b[]=new int[40];
        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        }
        for(k=lb;k<=ub;k++)
        a[k]=b[k];
    }
void mergesort(int a[],int lb,int ub){
    int mid;
    if(lb<ub){
        mid=(lb+ub)/2;
        mergesort(a,lb,mid);
        mergesort(a,mid+1,ub);
        merge(a,lb,mid,ub);
    }
}
	public static void main(String[] args) {
	int a[]={6,9,4,1,0,3,5,2};
int n=8;
	Main m1 = new Main();  
    System.out.println("\nBefore sorting array elements are - ");  
     System.out.println(Arrays.toString(a));
    m1.mergesort(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    System.out.println(Arrays.toString(a));  
	}
}

/*
Output:

Before sorting array elements are - 
[6, 9, 4, 1, 0, 3, 5, 2]

After sorting array elements are - 
[0, 1, 2, 3, 4, 5, 6, 9]
*/
