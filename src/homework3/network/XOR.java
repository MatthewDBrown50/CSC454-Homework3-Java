package homework3.network;

public class XOR {
    private int s;

    protected XOR(){
        this.s = 0;
    }

    protected String lambda(){
        return String.valueOf(this.s);
    }

    protected void delta(int[] input){
        this.s = input[0] ^ input[1];
    }

    public int getS() {
        return s;
    }
}
