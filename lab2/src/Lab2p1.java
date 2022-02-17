import java.util.Scanner;
public class Lab2p1 {
    static final int numMult = 5;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int choice, m, n, digit, result;
        long num;

        do{
            System.out.println("Perform the following methods: ");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit\n");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.print("m = ");
                    m = sc.nextInt();
                    System.out.print("n = ");
                    n = sc.nextInt();

                    result = divide(m, n);
                    if(result != -1)
                    	System.out.println(m + "/" + n + " = " + result + "\n");
                    else
                    	System.out.println("Invalid input for n\n");
                    break;
                case 3:
                    System.out.print("m = ");
                    m = sc.nextInt();
                    System.out.print("n = ");
                    n = sc.nextInt();

                    result = modulus(m, n);
                    if(result != -1)
                    	System.out.println(m + " % " + n + " = " + result + "\n");
                    else
                    	System.out.println("Invalid input for n\n");
                    break;
                case 4:
                    System.out.print("n : ");
                    n = sc.nextInt();
                    result = countDigits(n);
                    if(result > 0)
                        System.out.println("n : " + n + " - count = " + result + "\n");
                    break;
                case 5:
                    System.out.print("n : ");
                    n = sc.nextInt();
                    System.out.print("digit : ");
                    digit = sc.nextInt();
                    result = position(n, digit);

                    System.out.println("position = " + result + "\n");
                    break;
                case 6:
                    System.out.print("n : ");
                    num = sc.nextLong();
                    num = extractOddDigits(num);
                    if(num > -2)
                        System.out.println("oddDigits = " + num + "\n");
                    break;
                case 7:
                    System.out.println("Program terminating...");
                    break;
            }
        } while(choice < 7);

        sc.close();
    }
    public static void mulTest(){
        int multiplicand, multiplier, trueAns, userAns;
        int numCorrect = 0;

        for(int i = 0; i < numMult; i++){
            multiplicand = (int) (Math.random() * 9 + 1);
            multiplier = (int) (Math.random() * 9 + 1);
            trueAns = multiplicand * multiplier;
            
            System.out.print("How much is " + multiplicand + " times " + multiplier + "? ");
            userAns = sc.nextInt();

            if(userAns == trueAns)
                numCorrect++;
        }
        System.out.println(numCorrect + " answers out of " + numMult + " are correct.\n");
    }
    public static int divide(int m, int n){
        int numSubtract = 0;
    	if(n != 0) {
	        while(m >= n){
	            numSubtract++;
	            m -= n;
	        }
    	}
    	else {
    		numSubtract = -1;
    	}

        return numSubtract;
    }
    public static int modulus(int m, int n){
    	if(n != 0) {
	        while(m >= n){
	            m -= n;
	        }
	        return m;
    	}
    	else
    		return -1;
    }
    public static int countDigits(int n){
        int numDigits = 0;
        
        if(n < 0){
            System.out.println("Invalid input!");
            return 0;
        }
        else{
            do{
                numDigits++;
            } while((n /= 10) != 0);
        }

        return numDigits;
    }
    public static int position(int n, int digit){
        int digitLen;
        digitLen = countDigits(n);

        for(int i = 1; i <= digitLen; i++){
            if(n % 10 == digit) return i;
            
            n /= 10;
        }

        return -1;
    }
    public static long extractOddDigits(long n){
        int multiplier = 1;
        long numNew = 0;

        if(n < 0){
            System.out.println("Invalid input!");
            return -2;
        }
        else{
            do{
                if((n % 10) % 2 == 1){
                    numNew += (n % 10) * multiplier;
                    multiplier *= 10;
                }
                n /= 10;
            } while(n != 0);

            if(numNew == 0)
                return -1;
            else 
                return numNew;
        }
    }
}