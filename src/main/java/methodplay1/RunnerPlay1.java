package methodplay1;

public class RunnerPlay1 extends MethodPlay1{

    @Override
    public void getStatus(int a ,int b)
    {

        System.out.println("override test");
    }

    public static void main(String[] args) {

        MethodPlay1 obj = new MethodPlay1();
        MethodPlay1 obj1 = new MethodPlay1("test","test");
        String result;
        int resultt;
        obj.getStatus(10,20);
        obj.getStatus();
        resultt= obj.calc(10,20);
        System.out.println(resultt);
        obj.calc(10,20,30);
        MethodPlay1 objcp = new MethodPlay1();

        RunnerPlay1 objot= new RunnerPlay1();
        objot.getStatus();


    }
}
