package wk2;

public class MathStorm {

    private int minNumber = 1, maxNumber = 20;
    private int operand1 = minNumber, operand2 = maxNumber;
    private double answer;
    char operator = '+';
    double userGuess;
    int incorrectGuesses = 3;



   //constructor = special method. Same name as class
   //no return data  type

    //default or no-args constructor
   public MathStorm(){}

    public MathStorm(int incorrectGuesses) {
       this.incorrectGuesses = incorrectGuesses;
    }
    public MathStorm(int minNumber, int maxNumber){
       this.minNumber = minNumber;
       this.maxNumber = maxNumber;
    }

    public MathStorm(int incorrectGuesses, int minNumber, int maxNumber){

       this(minNumber, maxNumber);
       this.incorrectGuesses = incorrectGuesses;

    }

    public void setOperand1(int operand1) {
       if(operand1 >= minNumber && operand1 <= maxNumber)
           this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        if(operand2 >= minNumber && operand2 <= maxNumber)
            this.operand2 = operand2;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    private void calculate() {
//        switch(operator){
//            case '+': answer = operand1 + operand2; break;
//            case '-': answer = operand1 - operand2; break;
//            case '*': answer = operand1 * operand2; break;
//            case '/': answer = operand1 / (double)operand2; break;
//        }
        answer = switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            default -> operand1 / (double) operand2;
        };
    }

    //getter or setter
    //getter: get the value of a private attribute
    //setter: set the value of a private attribute

    public double getAnswer() {
       calculate();
       return answer;
    }
    public void setOperator(char operator) {
//       if(operator == '-' || operator == '+'
//    || operator == '*' || operator == '/'){
//           this.operator = operator;
//       }
//       else{
//           System.out.println("Invalid operator! Defaulting to PLUS");
//           this.operator = '+';
//       }

        this.operator = switch (operator){
            case '+', '-', '*', '/' -> operator;
            default -> {
                System.out.println("Invalid Operator. Defaulting to PLUS");
                yield '+';
            }
        };

    }

    @Override
    public String toString(){
        calculate();
       return String.format("%d %c %s = %.1f", operand1, operator, operand2, answer);
    }
}