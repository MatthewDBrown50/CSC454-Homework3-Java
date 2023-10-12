package homework3.network;

public class Network {
    private final XOR xor1;
    private final XOR xor2;
    private final Memory memory;
    private int internalCycle;
    private int[] xor1Input;
    private int[] xor2Input;
    private int memoryInput;

    public Network(){
        this.xor1 = new XOR();
        this.xor2 = new XOR();
        this.memory = new Memory();
        this.internalCycle = 0;

        System.out.println("t  Xn  Xxor1  Xxor2  Xm  Sxor1  Sxor2   Sm   Yxor1  Yxor2  Ym  Yn");
        System.out.println("0                         0      0     (0,0)                     ");
    }

    public String executeMachineCycle(int[] input){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 3; i++){
            internalCycle++;

            xor1Input = input;
            xor2Input = new int[]{xor1.getS(), memory.getS()};
            memoryInput = xor2.getS();

            String lambdaValues = this.lambda();

            delta();

            String xor1State = String.valueOf(xor1.getS());
            String xor2State = String.valueOf(xor2.getS());
            String memoryState = String.valueOf(memory.getS());

            String outputString = internalCycle + "  " + input[0] + input[1] + "   " + xor1Input[0] + xor1Input[1] +
                    "     " + xor2Input[0] + xor2Input[1] + "    " + memoryInput + "    " + lambdaValues + xor1State +
                    "      " + xor2State + "     " + memoryState + "   " + xor2State + "\n";
            sb.append(outputString);
        }

        return sb.toString();
    }

    private String lambda(){
        String xor1Lambda = xor1.lambda();
        String xor2Lambda = xor2.lambda();
        String memoryLambda = memory.lambda();

        return xor1Lambda + "      " + xor2Lambda + "     " + memoryLambda + "   ";
    }

    private void delta(){
        xor1.delta(xor1Input);
        xor2.delta(xor2Input);
        memory.delta(memoryInput);
    }
}
