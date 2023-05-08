import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        Toy t1 = new Toy(10,"Плюшевый мишка");
        ToyList currentToys = new ToyList();
        System.out.println(currentToys);
        currentToys.addToy(t1);
        System.out.println(currentToys);
        currentToys.addToyList(List.of(
                new Toy(0.5,"Велосипед",3),
                new Toy(3,"Паззл",5),
                new Toy(10,"Слинки",10)
        ));
        System.out.println(currentToys);
        currentToys.saveToFile();
    }

}
