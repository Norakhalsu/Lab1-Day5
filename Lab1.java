import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.swing.text.DefaultCaret;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
           /* 1.  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
             two numbers , takes two numbers as input
             Input first number: 125
             Input second number: 24               */

         /*       Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the  number1 : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the number2 : ");
                int num2 = scanner.nextInt();

                int sum = num1 + num2;
                int multiply = num1 * num2;
                int subtract = num1 - num2;
                int divition = num1/num2;
                int remainder = num1%num2;
                System.out.println( num1+ " + "+num2 +" = " +  sum);
                System.out.println(num1 + " * " + num2 + "= " +  multiply);
                System.out.println( num1 + " - " + num2 + "=" + subtract);
                System.out.println(num1 + " / " + num2 + " =  " + divition);
                System.out.println(num1 + " % " + num2 + " = " + remainder);  */







          /*  2.Write a Java program that takes a number as input and prints its multiplication table up to 10.
               Test Data: nput a number: 8
               Expected Output :
                8 x 1 = 8
               8 x 2 = 16
               8 x 3 = 24
               ...
               8 x 10 = 80  */

     /*   Scanner scanner = new Scanner(System.in);
          System.out.println( " please enter your number to do table of multiply up to 10 ");
           int number = scanner.nextInt();
           int result =1;

         for ( int i=0 ; i <= 10; i++ ){
             result=  number * i ;
             System.out.println(" the number " + number+" by multiply by "+ i + " the result is:  "+ result); } */











          /*
           3. Write a Java program to print the area and perimeter of a circle.
          Test Data:
          Raduis = 7.5
          Expected Output
          Perimeter is = 47.12388980384689
          Area is = 176.7145867644258    */

      /*   Scanner scanner=new Scanner(System.in);
           double pi = 3.14;
           System.out.println(" Write a Raduis  ");
           double radius= scanner.nextDouble();

          double perimeter = 2 * pi * radius;
          System.out.println("Perimeter is = " + perimeter);
          double area = pi * radius * radius;
          System.out.println("Area is = " + area);    */





        /* 4. Java program to find out the average of a set of integer
        Enter the count of numbers: 5
         Enter an integer:3
          Enter an integer: 8
         Enter an integer:6
          Enter an integer:7
          Enter an integer: 2
         The average is: 5.7      */

 /*     Scanner scanner=new Scanner(System.in);
        double averag;
        int sumnumbers = 0;
        System.out.print(" write the count !: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count ; i++) {
            System.out.print(" write number! : ");
            int number = scanner.nextInt();

                    sumnumbers += number ;  }
                   averag= (double) sumnumbers / count;
                System.out.println(" average : " + averag);   */








         /*  5. Write a Java program that accepts three integers as input, adds the first two integers
               together, and then determines whether the sum is equal to the third integer.
                     Input the first number : 5
                    Input the second number: 10
                    Input the third number : 15
                     The result is: true
                  --------
                  Input the first number : 10
                  Input the second number: 20
                  Input the third number : 25
                 The result is: false       */

   /*   Scanner scanner= new Scanner(System.in);
        System.out.println(" enter frist number ");
        int num1 = scanner.nextInt();
        System.out.println(" enter second number ");
        int num2 = scanner.nextInt();
        System.out.println(" enter third number ");
        int num3 = scanner.nextInt();
        int sumofadd=num1+num2;

        if(sumofadd == num3){
            System.out.println(" the result is "+ true );
        } else {
            System.out.println(" the result is " + false );
        }       */








        /*    6.Write a Java program to reverse a wor
                     Sample Output:
                     Input a word: dsaf
                     Reverse word: fasd       */

      /*  Scanner scanner=new Scanner(System.in);
        System.out.println(" please enter the word ");
        String word=scanner.nextLine();
        String revers= "" ;

        for ( int i=word.length() -1 ; i>=0 ; i-- ){
            revers += word.charAt(i);
        }System.out.println(" the word is: " + word + " the revers is : " + revers );   */







        /* 7. - Java program to check whether the given number is even or odd
           Enter a number: 33  The number is Odd
           Enter a number: 24 The number is Even      */

     /*   Scanner scanner=new Scanner(System.in);
          System.out.println(" please Ernter anumber to check if 'even' OR  'odd '  ");
              int num =scanner.nextInt();

              if ( num % 2 ==0 ){
                  System.out.println(" the number " + num +" is even ");
              }
              else {  System.out.println(" the number "+ num + " is odd");  }   */






        /* 8 - Java program to convert the temperature in Centigrade to Fahrenheit
             Enter temperature in Centigrade:  43
             Temperature in Fahrenheit is: 109.4   */

    /*      Scanner scanner=new Scanner(System.in);
          System.out.println(" write temperature in centigrade to convert it to Fahrenheit");
          double temp =scanner.nextInt();
          double fahrenheit=(temp * 9/5)+ 32 ;
          System.out.println(" the tempreture in fehrinhite is : " + fahrenheit );   */






        /* 9. Write a Java program that takes a string and a number from the user,then prints the character in the given index
               Test Data:
               Input a string: Java Bootcamp
               Input a number: 1
               Expected Output: a        */

        /*    Scanner scanner=new Scanner(System.in);
              System.out.println("write a string ");
              String string= scanner.nextLine();
              System.out.println(" write a number index  ");
              int number =scanner.nextInt();
              // int index=string.length();
              if (number >= 0 && number < string.length()) {
                  System.out.println(" the output: " + string.charAt(number)) ;}
                else {
                    System.out.println(" invalid "); }    */





       /* 10. Write a Java program to print the area and perimeter of a rectangle
          Test Data:
          Width = 5.5 Height = 8.5
          Expected Output
          Area is 5.6 * 8.5 = 47.60
         Perimeter is 2 * (5.6 + 8.5) = 28.2       */

     /*  Scanner scanner=new Scanner(System.in);
        System.out.println(" write Width rectangle ");
        float width=scanner.nextFloat();
        System.out.println(" write  Height rectangle " );
        float height=scanner.nextFloat();

        float  area=width * height ;
        float perimeter =2 * (width + height);
        System.out.println( " the Area is : " + width+ " * " + height +" = " + area);
        System.out.println( " the Perimeter is :" +2+ "* ("+ width+ " * " + height +") = " + perimeter);   */




     /*   11. Write a Java program to compare two number
     Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39 
25 <= 39 */

      /*     Scanner scanner=new Scanner(System.in);
        System.out.println(" write frist number ");
        int num1 = scanner.nextInt();
        System.out.println(" write second number ");
        int num2 = scanner.nextInt();

           if (num1 == num2  ) {
               System.out.println(num1 + " = " + num2);
           }
           else if (num1 != num2 &&num1 < num2 && num1 <= num2 ) {
                   System.out.println(num1 + " != " + num2);
                    System.out.println(num1+" < "+num2);
                    System.out.println(num1+" <= "+num2);
                }
           else if(num1 != num2 && num1>num2 && num1 >= num2) {
            System.out.println(num1 + " != " + num2);
            System.out.println(num1 + " > " + num2);
            System.out.println(num1 + " >= " + num2);
        }  */



        /* 12. Write a Java program to convert seconds to hours, minutes  and seconds Sample Output:
               Input seconds: 86399
               23:59:5   */
       /*    Scanner scanner = new Scanner(System.in);
             System.out.print("what seconds?  ");
             int Sec = scanner.nextInt();
             int hours = Sec / 60 / 60;
             int minutes = (Sec / 60) % 60;
             int seconds = Sec % 60;
             System.out.println(hours + ":" + minutes + ":" + seconds );     */




        /* 13. Write a Java program that accepts four integers from the user and prints equal if all
               four are equal, and not equal otherwise
                Sample Output:
 Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println(" write number1  ");
        int num1 = scanner.nextInt();
        System.out.println(" write number2  ");
        int num2 = scanner.nextInt();
        System.out.println(" write number3 ");
        int num3 = scanner.nextInt();
        System.out.println(" write number4  ");
        int num4 = scanner.nextInt();

                if (num1 == num2 && num2 == num3 && num3 == num4) {
                    System.out.println("Numbers are equal");
                } else {
                    System.out.println("Numbers are not equal");
                }      */





 /* 14. Write a Java program that reads an integer and check whether it is negative, zero, or
 positive.
 Test Data
Input a number: 7
Expected Output : Number is positive    */

     /*   Scanner scanner=new Scanner(System.in);
        System.out.println(" write  number to check if negative , zero or positive  ");
        int num = scanner.nextInt();
          if ( num > 0 ){
              System.out.println("number is positive ");
          }
   else if ( num <0 ){
              System.out.println(" number is nigative ");
          }
   else {
              System.out.println(" number is zero ");
          }     */






        /* 15.Write a program to enter the numbers till the user wants and at the end it should
        display the count of positive, negative and zeros entered
         (End loop use -1 , Don’t count -1).
         Test data
1
3
0
-2
-4
-1
2 positives
1 zero
2 negative  */

              /*  Scanner scanner = new Scanner(System.in);
                int positiveCount = 0;
                int negativeCount = 0;
                int zeroCount = 0;
                System.out.println("Enter numbers (enter -1 to stop):");
                while (true) {
                    int number = scanner.nextInt();
                    if (number == -1) {
                        break;
                    }
                    if (number > 0) {
                        positiveCount++;
                    } else if (number < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    } }
                System.out.println(positiveCount + " positives");
                System.out.println(zeroCount + " zeros");
                System.out.println(negativeCount + " negatives");    */




        /* 16 - Write a program that prompts the user to input an integer and then outputs the
           number with the digits reversed.   For example, if the input is 12345, the output should be 54321 */

         /*      Scanner scanner = new Scanner(System.in);
                  System.out.print("Enter a number: ");
                 int num = scanner.nextInt();
                 int revers=0;
                 while (num>0) {
                    int digit=num%10;
                    revers=revers*10+digit;
                    num/=10;
                  } System.out.println(" reversed number is: "+revers); */





      /* 17 - Write a program to enter the numbers till the user wants and at the end the program
should display the largest and smallest numbers entered enter the number : 4
enter the number : 5
enter the number : -1
enter the number : 9
the large number : 9
the small number : -1 */


            /*    Scanner scanner = new Scanner(System.in);
                int num;
                int largest;
                int smallest;
                System.out.print("write the first number: ");
                largest = smallest = scanner.nextInt();
                while (true) {
                    System.out.print("write the next number * 'q' to quit*: ");
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("q")) {
                        break;
                    } num = Integer.parseInt(input);
                    if (num > largest) {
                        largest = num;  }
                    if (num < smallest) {
                        smallest = num; } }
                System.out.println("the largest number is: " + largest);
                System.out.println("the smallest number is: " + smallest);  */






  /*      18 - Determine and print the number of times the character ‘a’ appears in the input
          entered by the user Enter String: Java bootcamp
          Output: Number of a's: 3       */

        /* Scanner scanner=new Scanner(System.in);
        System.out.println(" write a string to check number of ' a ' ");
        String input=scanner.nextLine();
      //
               int count = 0;
                for (int i = 0; i < input.length(); i++) {
                    if ( input.charAt(i) == 'a') {
                        count++; } }
                System.out.println(" number of a's : " + count);    */







    }
}
