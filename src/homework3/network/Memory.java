package homework3.network;

public class Memory {
    private int[] s;

    protected Memory(){
        this.s = new int[2];
    }

    protected String lambda(){
        return "(" + s[0] + "," + s[1] + ")";
    }

    protected void delta(int x){
        s[0] = s[1];
        s[1] = x;
    }

    public int getS() {
        return s[0];
    }
}
