public class FizzBuzz {
    
    public static void main(String[] args) {

        int num = 15;

        String output = "";
        if (num % 3 == 0) {
            output = "Fizz";
        }
        if (num % 5 == 0) {
            output += "Buzz";
        }

        if (output.isEmpty()){
            System.out.println(num);
        } else {
            System.out.println(output);
        }

    }
}