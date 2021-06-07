package denisenko.homeTask02;


public class House {
    protected static int defaultUpStairs = 8;
    protected static int defaultDownStairs = 0;

    protected House() {
        int upStairs = defaultUpStairs;
        int downStairs = defaultDownStairs;
    }
    protected House(int upStairs, int downStairs) {
        defaultUpStairs = upStairs;
        defaultDownStairs = downStairs;
    }

    public int getHouseSizeUp(){
        return defaultUpStairs;
    }
    public int getHouseSizeDown(){
        return defaultDownStairs;
    }
}
