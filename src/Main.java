import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number member: ");
        int n = s.nextInt();
        if(n<=0){
            System.out.println("Out of member");
            return;
        }
        int arr[] = new int[n];
        int temp = 0;
        System.out.print("Enter all member you want: ");
        for(int i=0; i<n ; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("This is member before Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("This is number after sorting: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}