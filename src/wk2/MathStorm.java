package wk2;

public class MathStorm {

    int operand1, operand2;
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
}