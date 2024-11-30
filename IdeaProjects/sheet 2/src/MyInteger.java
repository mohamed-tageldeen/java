public class MyInteger {
    private int value;

    public MyInteger (int value){
        this.value = value;

    }
    public void setValue (int value){
        this.value = value;
    }
    public int getValue (){
        return value;
    }
    public boolean isEven(){
        if (this.value % 2 == 0)
            return true;
        else
            return false;
    }
    public boolean isOdd(){
        if (this.value % 2 != 0)
            return true;
        else
            return false;
    }

}
