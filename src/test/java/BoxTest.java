import org.example.Box;
import java.util.Arrays;
import java.util.Collection;

//створити класс BoxTest з методом main(), в якому створити екземпляр класу Box,
// використовуючи різні типи обʼєктних даних. Створити колекцію, в яку помістити значення
// трьох змінних класу Box та вивести на екран типи цих змінних, користуючись методом з класу Box.

public class BoxTest {

    public static void main(String[] args) {

        Box<Integer, String, Double> myBox = new Box<>(10, "NutBox", 3.14);

        Collection<Object> collection = Arrays.asList(myBox.getT(), myBox.getU(), myBox.getV());
        myBox.printTypes(collection);
    }
}