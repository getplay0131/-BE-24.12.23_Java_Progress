package Progress_241223.extends1.super1;

public class Child extends Parent {
public String value = "child";

public void hello(){
    System.out.println("Child.hello");
}

public void call(){
        System.out.println("this value= " + this.value);
        System.out.println("super value= " + super.value);

    this.hello();
    super.hello();
    }
}