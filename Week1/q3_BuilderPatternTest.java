public class q3_BuilderPatternTest {
        public static void main(String[] args) {
                q3_Computer basicComputer = new q3_Computer.Builder("Intel i3", 8, 256)
                                .operatingSystem("Windows 10")
                                .build();
                System.out.println("Basic Computer: " + basicComputer);

                q3_Computer gamingComputer = new q3_Computer.Builder("Intel i9", 32, 1000)
                                .GPU("NVIDIA RTX 3080")
                                .operatingSystem("Windows 11")
                                .build();
                System.out.println("Gaming Computer: " + gamingComputer);

                q3_Computer minimalistComputer = new q3_Computer.Builder("AMD Ryzen 5", 16, 512)
                                .build();
                System.out.println("Minimalist Computer: " + minimalistComputer);
        }
}