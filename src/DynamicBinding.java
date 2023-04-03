abstract class Animal{
    private int height;
    private int weight;
    
    public int getheight(){return height;}
    public int geweight(){return weight;}
    
    public void setheight(int height)
    {
        this.height = height;
        
    }
    public void setweight(int weight)
    {
        this.weight = weight;
        
    }
    abstract String makenoise();
}
class Dog extends Animal{
    
   public String makenoise()
   {
       return "Bow Bow";
   }
}
class Cat extends Animal{
    public String makenoise()
    {
        return "meow meow";
    }
}
public class DynamicBinding {
    public static void main(String[] args){
        DynamicBinding db = new DynamicBinding();
        Dog a = new Dog();
        Cat b = new Cat();
        db.noise(a);
        db.noise(b);
    }
    public void noise (Animal a)
    {
        System.out.println(a.makenoise());
    }
    
    
}
