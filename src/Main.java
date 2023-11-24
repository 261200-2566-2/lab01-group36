import java.util.Scanner;
public class Main {

    public static int[] sortingArray(int n, int[] arr){
        int temp = 0;
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number member: ");
        int n = s.nextInt();
        if(n<=0){
            System.out.println("Out of member");
            return;
        }
        int arr[] = new int[n];
        System.out.print("Enter all member you want: ");
        for(int i=0; i<n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("This is member before Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sortingArray(n,arr);
        System.out.println();

        System.out.println("This is number after sorting: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}