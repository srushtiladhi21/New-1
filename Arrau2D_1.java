import  java.util.*;
public class Arrau2D_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int arr1[][]=new int[rows][col];
        int arr2[][]=new int[rows][col];
         int arr3[][]=new int[rows][col];
        System.out.println("Enter the elements of matrix 1: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
System.out.println("Enter the elements of matrix 2: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

       // System.out.println("Addition of two matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }



        System.out.println("Addition of two matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
