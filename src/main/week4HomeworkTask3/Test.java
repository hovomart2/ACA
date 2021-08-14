package week4HomeworkTask3;

public class Test {
    public static void main(String[] args) {
        X86IntelProcessor x86IntelProcessor = new X86IntelProcessor();
        x86IntelProcessor.calculateBinary(25);
        x86IntelProcessor.calculateBinary(884);
        x86IntelProcessor.calculateBinary(721);
        X8664IntelProcessor x8664IntelProcessor = new X8664IntelProcessor();
        x8664IntelProcessor.calculateBinary(25);
        x8664IntelProcessor.calculateBinary(884);
        x8664IntelProcessor.calculateBinary(721);
        ArmProcessor armProcessor = new ArmProcessor();
        armProcessor.calculateBinary(25);
        armProcessor.calculateBinary(884);
        armProcessor.calculateBinary(721);
    }
}
