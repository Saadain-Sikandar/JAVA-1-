
import java.util.Scanner;



//public class Main {
//    public static void Guessrandom(int random) {
//        int guesses = 0;
//        char cont;
//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.printf("enter the guess:");
//            int guess = input.nextInt();
//
//            if (guess < random) {
//                System.out.println("Too low! Try again");
//                guesses++;
//                Guessrandom(random);
//
//            } else if (guess > random) {
//                System.out.println("Too high!Try again.");
//                guesses++;
//                Guessrandom(random);
//
//            } else if (guess == random) {
//                System.out.println("Congratulation you won!");
//                guesses++;
//                System.out.println("guesses:" + guesses);
//            } else {
//                System.out.println("Invalid character.Try again.");
//                Guessrandom(random);
//            }
//
//            System.out.println("Do you want to continue press y;");
//            cont = input.next().charAt(0);
//
//        } while (cont =='Y'||cont=='y');
//    }
//
//   public static void main(String[]  args){
//
//        int random = (int)(10 + Math.random()*90);
//        Scanner input = new Scanner(System.in);
//        Guessrandom(random);
//   }
//
//}


//PALINDROME


//    public class Main{
//    public static void palindrome(String word) {
//            char cont;
//
//        do {
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter the string:");
//            word = input.nextLine();
//            int low = 0;
//            int high = word.length() - 1;
//
//
//            boolean ispalindrome = true;
//            if (word.charAt(low) != word.charAt(high)) {
//                ispalindrome = false;
//                low++;
//                high--;
//            }
//
//            if (ispalindrome) {
//                System.out.println(word + " is a palindrome:");
//            } else {
//                System.out.println(word + " is not a palindrome:");
//            }
//            System.out.println("Do you want to continue press Y/N:");
//              cont = input.next().charAt(0);
//
//
//        }while (cont=='y'||cont=='Y');
//    }
//
//   public static void main(String[] args){
//      String word;
//      Scanner input = new Scanner(System.in);
//       System.out.println("Enter the String:");
//       word = input.nextLine();
//       palindrome(word);
//
//   }
//
//}


//FOR LOOP


//public class Main{
//
//    public static void main(String[] args){
//        System.out.println("Multiplication Table:");
//        System.out.println("  ");
//        for(int i=1;i<=10;i++){
//            System.out.println("   "+i);
//        }
//        System.out.println("----------------------------------------------------");
//    //     int num;
//    //        Scanner input = new Scanner(System.in);
//    //         System.out.println("Enter the number for table:");
//    //        num =  input.nextInt();
//       for(int i=1;i<=10;i++){
//           System.out.println(i + "|");
//        for(int j=1;j<=10;j++){
//            System.out.println(i + "*"+ j +"=" +i*j);
//
//        }
//           System.out.println("  ");
//       }
//
//    }
//}


//GREATEST COMMON DIVISOR

//public class Main{
//
//    public static void main(String[] args){
//
//       int num1, num2;
//       Scanner input = new Scanner(System.in);
//        System.out.println("Enter the num1:");
//       num1 = input.nextInt();
//        System.out.println("Enter the num2:");
//        num2 = input.nextInt();
//        int gcd = 1;
//        int k = 2;
//        while(k <= num1 && k <= num2){
//            if(num1 % k == 0 && num2 % k == 0) {
//                gcd = k;
//            }
//            k++;
//        }
//        System.out.println("The GCD of "+num1 +" and " + num2+ " is "+ gcd);
//    }
//}


// ARRAY!

//    public class Main{
//
//        public static  void main(String[] args){
//
//          int sizeof;
//            Scanner input = new Scanner(System.in);
//        System.out.println(" Enter the size of array:");
//        sizeof = input.nextInt();
//            int[] array = new int[sizeof];
//         for(int i=0 ;i<array.length;i++){
//             System.out.println("Enter the element at index " + i + ":");
//             array[i] = input.nextInt();
//         }
//         for(int i =0 ;i<array.length;i++){
//
//             System.out.println("The element at index "+ i + " is " + array[i]);
//         }
//
//    }
//}


//PRIME NUMBER CHECK.


//    public class Main{
//             public static int primenumber(int number){
//
//              while(number<=1){
//                  System.out.println("Invalid number:Try Again.");
//              }
//              if(number%2==0){
//                  System.out.println(number+" is not a prime number.");
//              }
//             else {
//                  System.out.println(number+" is a prime number ");
//              }
//              return 1;
//             }
//
//         public static void main(String[] args){
//            int number;
//             Scanner input = new Scanner(System.in);
//             System.out.println("Enter the number:");
//             number = input.nextInt();
//             primenumber(number);
//
//
//         }
//}


// REAL PRIME NUMBER CHECK

//public class Main{
//
//        public static void primenum(int number){
//
//            Scanner input = new Scanner(System.in);
//
//           while (number<=1){
//               System.out.println("Invalid number!Try again.");
//               number = input.nextInt();
//           }
//            if(number%2!=0){
//                System.out.println(number+" is a prime number ");
//            }
//            else {
//                System.out.println(number + " is not a prime number");
//            }
//
//            System.out.println("The prime numbers till " +number+" are: ");
//            for(int i=0;i<number;i++){
//               if(i%2!=0){
//                   System.out.println(i);
//               }
//           }
//
//        }
//    public static void main(String[] args){
//            int number;
//            Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        number= input.nextInt();
//        primenum(number);
//
//    }
//}


//
                //FIBONACCI SERIES
//
//public class Main{
//        public static int Fibonacchi(int n){
//
//            if (n == 0){
//                return  0;
//            }
//            if (n == 1){
//                return 1;
//            }
//
//            int  fNm1 = Fibonacchi(n - 1);
//            int fNm2 = Fibonacchi(n - 2);
//            int fibN = fNm1 + fNm2;
//
//            return fibN;
//        }
//      public static void main(String[] args){
//
//            int n;
//            Scanner input = new Scanner(System.in);
//          System.out.println("enter the number of terms for fibonacci Series:");
//          n = input.nextInt();
//          System.out.println("Fibonacci series till the " + n +"term is:\n");
//          for(int i = 0;i<n;i++){
//              System.out.println(Fibonacchi(i));
//          }
//
//      }
//}

                //FACTORIAL

//public class Main{
//
//    public static int Factorial(int n){
//        if(n==0||n==1){
//            return 0;
//        }
//        int result = 1;
//        for(int i = 1 ; i<=n; i++){
//            result = result * i;
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        int n;
//        System.out.println( "Enter the number to find its factorial:");
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        System.out.println("The Factorial of "+n+" number is:" + Factorial(n));
//
//    }
//
//}

        //PALINDROME
//public class Main{
//
//        public static void palindrome(String word){
//
//          Scanner input = new Scanner(System.in);
//
//         int low=0;
//         int high= word.length() - 1;
//
//        boolean ispalindrome = true;
//        if(word.charAt(low)!=word.charAt(high)){
//           ispalindrome = false;
//           low++;
//           high--;
//                }
//
//            if (ispalindrome){
//                System.out.println(word + " is palindrome.");
//
//            }
//            else{
//                System.out.println(word + " is not palindrome.");
//            }
//
//        }
//
//      public static void main(String[] args){
//
//          String word;
//            Scanner input = new Scanner(System.in);
//          System.out.println("Enter the string to reverse:");
//          word = input.nextLine();
//          palindrome(word);
//
//
//      }
//
//}
            //REVERSE STRING

//public class Main{
//    public static void reverse(char[]word ){
//
//       int start = 0;
//       int end = word.length-1;
//       while(start<end){
//           char temp = word[start];
//           word[start] = word[end];
//           word[end] = temp;
//           start ++;
//           end --;
//       }
//
//
//        System.out.println("The reverse of the string is:"+new String(word));
//    }
//
//    public static  void main(String[] args){
//        String word;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the word to reverse:");
//        word = input.nextLine();
//        reverse(word.toCharArray());
//
//    }
//}


//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String word = input.nextLine();
//        ;
//
//        char[] chararray = word.toCharArray();
//        int length = chararray.length;
//        for (int i = 0; i < length / 2; i++) {
//            char temp = chararray[i];
//            chararray[i] = chararray[length - i - 1];
//            chararray[length - i - 1] = temp;
//        }
//
//        System.out.println("The reverse string is:" + new String(chararray));
//
//
//    }
//}



//
//public class Main {
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void printPrime(int n) {
//        boolean skip = false;
//        for (int i = 2; i <= n; i++) {
//            if (skip) {
//                skip = false;
//                continue;
//            }
//
//            if (isPrime(i)) {
//                System.out.println(i);
//                skip = true;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int n;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the term:");
//        n = input.nextInt();
//        printPrime(n);
//    }
//    }