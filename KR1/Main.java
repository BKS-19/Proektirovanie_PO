import java.io.PrintStream;

class Main{
    public static void main(String[] args){
        Hello hello = new HelloImpl();
        hello.printHelloWorld(System.out);
    }
}