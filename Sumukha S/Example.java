class Parent{
    void show(){
        System.out.println("Hello");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Hello from Child");
    }
    void bark(){
        System.out.println("barking");
    }
}

class Example{
    public static void main(String [] args){
        Child ob = new Child();
        ob.bark();
    }
}