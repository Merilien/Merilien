package Counter;

public class Counter {
    int value;
    int initValue;

    public Counter(){
        this.initValue = 0;
        this.reset();
    }

    public Counter(int value){
        this.initValue = value;
        this.reset();
    }

    public void add(int num){
        this.value += num;
    }

    public void add(){
        this.value++;
    }

    public int get(){
        return this.value;
    }

    public void reset(){
        this.value = initValue;
    }

}
