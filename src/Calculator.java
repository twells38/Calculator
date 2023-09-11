public class Calculator {
  private double operand1;
  private double operand2;
  private String operator;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void performOperation(double operand1, String operator, double operand2) {
        double result;
        if (operator.equals("+")) {
          result = operand1 + operand2;
            System.out.println(result);
        }
        if(operator.equals("-")){
            result = operand1 - operand2;
            System.out.println(result);
        }
        if(operator.equals("*")){
            result = operand1 * operand2;
            System.out.println(result);
        }
        if(operator.equals("/")){
            result = operand1/operand2;
            System.out.println(result);
        }
    }
}
