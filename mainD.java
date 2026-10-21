public class mainD {

    public static void main(String[] args) {
        
    }
}

interface coffee{
    int cost();
}

class basicCoffee implements coffee{
    public int cost(){
        return 100;
    }
}

abstract class coffeeDecorator{
    protected coffee c;

    public coffeeDecorator (coffee c){
        this.c =c ;
    }
}
