package task01;

public class ArrayTest03 {
    public static void main(String[] args) {
        Animal[] arr = {new Animal(), new Cat()};
        for(Animal animal : arr){
            System.out.println(animal);
        }

        for(int i = 0; i < arr.length; i++){
            arr[i].move();
            if(arr[i] instanceof Cat){
                Cat cat = (Cat)arr[i];
                cat.catchMouse();
            }
        }
    }
}

class Animal{

    public void move(){
        System.out.println("animal is moving");
    }

}

class Cat extends Animal{
    public void move(){
        System.out.println("cat is moving");
    }

    public void catchMouse(){
        System.out.println("cat is catching mouse");
    }
}
