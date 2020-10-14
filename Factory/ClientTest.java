package Factory;

import Factory.Computer;
import Factory.ComputerFactory;

public class ClientTest {
    public static void main(String[] args) {

        Computer laptop = ComputerFactory.getComputerInstance("LAPTOP", 2, 4, 5, false, false);
        System.out.println("laptop = " + laptop);
    }
}
