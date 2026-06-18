package dayFive;

public class Dog extends Animal{

    public void bark(){
        System.out.println("The dog barks");
    }

    @Override
    public void eat(){
        System.out.println("This dog eats bones");
    }

    @Override
    public void sound(){
        System.out.println("Dog sound is hoowf hoowf");
    }
}
