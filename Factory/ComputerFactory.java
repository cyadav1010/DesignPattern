package Factory;

public class ComputerFactory {


    public static Computer getComputerInstance(String laptop, int i, int i1, int i2, boolean b, boolean b1) {
        ComputerType type = ComputerType.valueOf(laptop);

        if(type.equals(ComputerType.LAPTOP)) {
            return new Laptop(i,i1,i2,b,b1);
        }  else if (type.equals(ComputerType.TESTPC)){
            return new TestPc(i,i1,i2,b,b1);
        }
        return null;
    }
}
