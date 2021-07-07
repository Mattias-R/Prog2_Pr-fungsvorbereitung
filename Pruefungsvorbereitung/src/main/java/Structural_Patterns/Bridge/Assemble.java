package Structural_Patterns.Bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("assembled");
    }
}
