public class Cat extends Animal{

    protected Cat(String name, int age, boolean sex, double price) {
        super(name, age, sex, price);
    }

    public String toString() {
        String result="name:"+name+"age"+age+"sex:"+sex+"price:"+price;
        return result;
    }
}
