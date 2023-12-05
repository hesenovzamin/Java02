import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        //1 ci mesele

        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }



        for (int i = 0; i < n; i++){
             for (int j = 2; j <= arr[i]/2 ; j++ ){
                 if(arr[i] % j != 0){
                     say ++;
                     break;
                 }
             }
        }

        System.out.println(say);

         */

        // 2 ci mesele

        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }



        for (int i = 0; i < n; i++){
            if(arr[i] % 7 == 0){
                say ++;
            }
        }

        System.out.println(say);

         */


        // 3 cu mesele

        /*

        int tek , cut;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        tek = arr[0] ; cut = arr[0];
        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0 &&  cut < arr[i]){
                cut = arr[i];
            }
            if(arr[i] % 2 == 1 &&  tek > arr[i]){
                tek = arr[i];
            }
        }

        System.out.println(tek + "    "  +cut);

         */

        // 4 cu mesele


        /*



        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            if(i % 2 == 1){
                arr[i] = 0;
            }
        }

       for( int x : arr){
           System.out.print(x + "   ");
       }

         */


        // 8 ci mesele



        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0 ; j < n ; j ++)
            {
                if(arr1[i] == arr1[j] && j != i ){
                    f = false;
                }
            }
            if(f){

                arr2[count] = arr1[i];
                count++;
            }
            f = true;
        }
        for(int x : arr2){

            if(x != 0){
                System.out.println(x);
            }


        }



        // 6 ci mesele

        /*

        boolean f = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                f = false;
                break;
            }
        }

        System.out.println(f);


         */

        // 7 ci mesele

        /*

        boolean f = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n/2; i++){
            if(arr[i] != arr[n-1-i]){
                f = false;
                break;
            }
        }

        System.out.println(f);

         */

        // 8 ci mesele

        /*

        boolean f = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER  ");
        int n = scanner.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        int say = 0;

        for (int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n/2; i++){
            if(arr1[i] != arr2[i]){

                f = false;
                break;
            }
        }

        System.out.println(f);

         */



    }
}