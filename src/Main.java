import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year; // year
        int month; // month
        int ans = 31; // Default # of days in a month
        boolean leap = false; // Default not a leap year
        char reply = 'n';// defines the variable "reply" as a char data type
        char reply2 = 'n';
        String monthname = "This month is not valid";
        System.out.println("Welcome to the Day Calculator");
        System.out.printf("Type in the year (1600-2400)   "); // person types in the year
        year = scan.nextInt();
        while ((year<1599) || (year>2553)) {
            System.out.printf("This Year Is Invalid! Please Try Again\n");
            System.out.printf("Type in the year (1600-2400)   ");
            year = scan.nextInt();
        }
        System.out.printf("You wrote %d\n", year); // confirms year
        if (leap == false){ // Leap year is always false, it will always check the following:
            if (year%4==0){ // If the year is divisble by four, leap is true
                leap = true;
            }
            if (year%100==0){ // If the year is divisible by 100, leap is false
                leap = false;
            }
            if (year%400==0){ // If the year is divisble by 400, leap is true
                leap = true;
            }
        }
        if (leap == true){ // If the leap is true, then it will tell the user the year is a leap year
            System.out.println("This year is a leap year");
        }
        System.out.printf("Type in the month (1-12)   "); // person types in the month
        month = scan.nextInt();
        while ((month<1)||(month>12)) {
            System.out.print("This Month is Invalid! Please Try Again\n");
            System.out.printf("Type in the month (1-12)   ");
            month = scan.nextInt();
        }
        if (month == 2) { // if the month is february (2) then...
            ans = 28; // if nothing below applies, then default answer is 28
            monthname = "February";
            if (year%4==0){  // if divisible by four then 29 days
                ans = 29;
            }
            if (year%100==0){ // if divisible by 100 then 28 days
                ans = 28;
            }
            if (year%400==0){ // if divisble by 400 then 29
                ans = 29;
            }
        }else{ // if the month is not february (2) then...
            switch(month){
                case 1:
                    monthname = "January";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 3:
                    monthname = "March";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 4: // if month = 4 then ans is 30
                    ans = 30;
                    monthname = "April";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 5:
                    monthname = "May";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 6: // if month = 6 then ans is 30
                    ans = 30;
                    monthname = "June";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 7:
                    monthname = "July";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 8:
                    monthname = "August";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 9: // if month = 9 then ans is 30
                    ans = 30;
                    monthname = "September";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 10:
                    monthname = "October";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 11: // if month = 11 then ans is 30
                    ans = 30;
                    monthname = "November";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
                case 12:
                    monthname = "December";
                    System.out.printf("You wrote %S\n", monthname); // confirms month
                    break;
            }
        }
        System.out.printf("Would you like to view the number of days in the month of %s in the year %d, Type (y) or (n)\n", monthname, year);
        reply = scan.next().charAt(0);
        if (reply == 'y'){
            System.out.printf("The Number of Days in This Month is %d\n", ans); // based on the requirements, this is the number of days in the specific month
        }else{

        }
        System.out.printf("Would you like to view the number of days in the year of %d, Type (y) or (n)\n", year); // asks if the person wants to see the number of days in the year they choose
        reply2 = scan.next().charAt(0);
        if (reply2 == 'y'){ // if the reply is yes then...
            if (leap == true){
                System.out.printf("The Number of Days in This Year is 366\n"); // based on the requirements, this is the number of days in the specific year
                System.out.println("This is the end of the program");
            }else{
                System.out.printf("The Number of Days in This Year is 365\n");
                System.out.println("This is the end of the program");
            }
        }else{
            System.out.println("This is the end of the program");
        }
    }
}