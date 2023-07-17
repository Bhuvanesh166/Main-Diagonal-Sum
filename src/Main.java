import java.util.Scanner;

class MainDiagonalSum{
    public int findMainDiagonalSum(int row ,int col ,int arr[][]){
        int sum=0;
        for(int i=0;i<row;i++){
           sum+=arr[i][i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MainDiagonalSum  mainDiagonalSum=new  MainDiagonalSum();
        System.out.println("Enter no of row  :");
        int row= scanner.nextInt();
        System.out.println("Enter no of col  :");
        int col= scanner.nextInt();
        System.out.println("Enter array elements  :");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mainDaigonalSum :"+ mainDiagonalSum.findMainDiagonalSum(row,col,arr));



    }
}