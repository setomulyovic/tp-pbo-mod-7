import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
    Animal a1 = new Animal(){
            @Override
            public void showName(){
                System.out.println("Bird");
            }
            @Override
            public void move() {
                System.out.println("Flying");
            }            
        };     

    Animal a2 = new Animal(){
            @Override
            public void showName(){
                System.out.println("Cat");
            }
            @Override
            public void move() {
                System.out.println("Walking");
            }            
        };  
    
    Animal a3 = new Animal(){
            @Override
            public void showName(){
                System.out.println("Fish");
            }
            @Override
            public void move() {
                System.out.println("Swimming");
            }            
        };  
        List<Animal> list = new ArrayList();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        for (Animal l:list){
            l.showName();
            l.move();
        }
    } 
}
