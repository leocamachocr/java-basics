public class Memory {

    public static void main(String[] args) {
        int primitiveValue=1;
        Object objectInstance = new Object();
        Memory memoryInstance = new Memory();
        memoryInstance.method(objectInstance);
    }

    private void method(Object param) {
        String value = param.toString();
        System.out.println(value);
    }

}

