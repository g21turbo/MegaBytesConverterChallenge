public class Main {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(1500);
        printMegaBytesAndKiloBytes(3500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int megaBytesRemainder = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + megaBytesRemainder + " KB");
        }
    }
}