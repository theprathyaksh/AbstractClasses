abstract class Super
{
    public Super(){System.out.println("super constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth 1");
    }
    abstract public void meth2();
    
}

class Sub extends Super
{
    public void meth2()
    {
        System.out.println("Meth2");
        
    }
}

public class AbstractClasses {

    
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth2();
    }
    
}
