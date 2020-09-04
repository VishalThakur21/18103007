import java.util.Scanner;

class set {

    void printUnion(int arr1[], int arr2[], int len1, int len2) {

        int f, i, j, k = 0;
        int arr3[] = new int[100];

        for (i = 0; i < len1; i++) {
            arr3[k] = arr1[i];
            k++;
        }

        for (i = 0; i < len2; i++) {
            f = 0;
            for (j = 0; j < len1; j++) {
                if (arr2[i] == arr1[j]) {
                    f = 1;
                }
            }

            if (f == 0) {
                arr3[k] = arr2[i];
                k++;
            }
        }

        System.out.print("\nUnion of Two Array is :");
        for (i = 0; i < k; i++) {
            System.out.print(" " + arr3[i]);
        }
    }

    void printIntersection(int arr1[], int arr2[], int len1, int len2) {

        int arr3[] = new int[100];
        int i, j, k = 0;

        for (i = 0; i < len1; i++) {
            for (j = 0; j < len2; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }

        System.out.print("\nIntersection of Two Array is :");
        for (i = 0; i < k; i++) {
            System.out.print(" " + arr3[i]);
        }
    }

    

    public static void main(String args[]) {

        int arr1[] = new int[100];
        int arr2[] = new int[100];

        int i, j, len1, len2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of 1st Array :");
        len1 = sc.nextInt();

        System.out.print("Enter 1st Array Elements :");
        for (i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Size of 2nd Array :");
        len2 = sc.nextInt();

        System.out.print("Enter 2nd Array Elements :");
        for (i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }

        set tt = new set();

        tt.printUnion(arr1, arr2, len1, len2);

        tt.printIntersection(arr1, arr2, len1, len2);



    }
}