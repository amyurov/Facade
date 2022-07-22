public class BinOps {

    public String sum(String a, String b) {
        int binOperand1 = Integer.parseInt(a, 2);
        int binOperand2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(binOperand1 + binOperand2);
    }

    public String mult(String a, String b) {
        int binOperand1 = Integer.parseInt(a, 2);
        int binOperand2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(binOperand1 * binOperand2);
    }

}
