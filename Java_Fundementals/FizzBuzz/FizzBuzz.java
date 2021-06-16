class FizzBuzz{
    public static void main(String[] args) {
        fizzBuzz(9);
    }
    public static void fizzBuzz(Integer x){
        if (x%3 == 0){
            System.out.print("Fizz ");
        }
        if (x%5 == 0){
            System.out.println("Buzz");
        }
    }
}