package homework3.network;

public class Memory {
    private final int[] s;

    protected Memory(){
        this.s = new int[2];
    }

    protected String lambda(){
        return String.valueOf(this.s[0]);
    }

    protected void delta(int x){
        s[0] = s[1];
        s[1] = x;
    }

    public int[] getS() {
        return s;
    }
}
