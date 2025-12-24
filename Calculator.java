public class Calculator {
    private int num1;
    private int num2;
    private int answer;
        
    public Calculator(int num1, int num2 ){
        this.num1 = num1;
        this.num2 = num2;
        this.answer = 0;

    }
    public void add(){
        answer = num1 + num2;
    }
    public void sub(){
        answer = num1-num2;
    }
    public void muilt(){
        answer = num1*num2;
    }
    public void div(){
        answer = num1/num2;
    }
    public int getAnswer(){
        return  answer;
    }
    public String toString(){
        return num1 + "," + num2 + "the answer is" + answer; 
    }
    


}