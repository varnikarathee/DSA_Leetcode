class Solution {
    public boolean parseBoolExpr(String expression) {
        Deque<Character> operands = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();
        for (char ch: expression.toCharArray()) {
            switch (ch) {
                case 't':
                case 'f':
                case '(':
                    operands.push(ch);
                    break;
                case '!':
                case '&':
                case '|':
                    operators.push(ch);
                    break;
                case ')':
                    char operator = operators.pop();
                    boolean result = eval(operands, operator);
                    operands.push(result==true ? 't' : 'f');
                default:
                    break;
            }
        }
        return operands.pop()=='t' ? true : false;
    }
    boolean eval(Deque<Character> operands, char operator) {
        switch (operator) {
            case '!':
                return not(operands);
            case '&':
                return and(operands);
            case '|':
                return or(operands);
        }
        return false;
    }
    boolean not(Deque<Character> operands) {
        boolean result = operands.pop()=='t' ? true : false;
        operands.pop();//'('
        return !result;
    }
    boolean and(Deque<Character> operands) {
        boolean result = true;
        while (operands.peek()!='(') {
            if (operands.pop()=='f')
                result = false;
        }
        operands.pop();//'('
        return result;
    }
    boolean or(Deque<Character> operands) {
        boolean result = false;
        while (operands.peek()!='(') {
            if (operands.pop()=='t')
                result = true;
        }
        operands.pop();//'('
        return result;
    }
}