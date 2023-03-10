package curso.java;

public class MultiplyService {

    private SumService sumService;  //Aquí para que sirva con todos

    public MultiplyService(SumService sumService) {
        this.sumService = sumService;
    }

    public int multiply(int op1, int op2){
        return op1 * op2;
    }

    //Devuelve op1 * op2 + op2
    public int multiplySum(int op1, int op2){
//        SumService sumService = new SumService();
        int sumando1 = op1 * op2;
        return sumService.sum(sumando1, op2);
    }

}
