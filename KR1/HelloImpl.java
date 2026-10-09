import java.io.PrintStream;

public class HelloImpl implements Hello {   
    @Override
    public void printHelloWorld(PrintStream out) {
        out.print("Hello, World!\n");   
    }
}