import java.io.IOException;
import java.io.RandomAccessFile;

public class StackFile {

    private String filename;
    private RandomAccessFile raf;
    private long topOff; // offset du prochain emplacement libre

    public StackFile() {
        this.topOff = 0;
    }

    public void set_file(String filename) {
        try {
            this.filename = filename;
            raf = new RandomAccessFile(filename, "rw");

            this.topOff = raf.length();

        } catch (IOException e) {
            System.out.println("Erreur ouverture fichier : " + e.getMessage());
        }
    }

    public void push_stack(int value) {
        try {
            raf.seek(topOff);
            raf.writeInt(value);
            topOff += 4;
        } catch (IOException e) {
            System.out.println("Erreur push : " + e.getMessage());
        }
    }

    public int pop_stack() {
        try {
            if (topOff == 0) {
                System.out.println("Stack Underflow (file empty)");
                return -1;
            }

            topOff -= 4;
            raf.seek(topOff);
            int value = raf.readInt();

            raf.setLength(topOff);

            return value;

        } catch (IOException e) {
            System.out.println("Erreur pop : " + e.getMessage());
            return -1;
        }
    }

    public int top_stack() {
        try {
            if (topOff == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            raf.seek(topOff - 4);
            return raf.readInt();
        } catch (IOException e) {
            System.out.println("Erreur top : " + e.getMessage());
            return -1;
        }
    }

    public void display_stack() {
        try {
            if (topOff == 0) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println("Stack (top -> bottom):");

            long pos = topOff - 4;

            while (pos >= 0) {
                raf.seek(pos);
                int value = raf.readInt();
                System.out.println(value);
                pos -= 4;
            }

        } catch (IOException e) {
            System.out.println("Erreur display : " + e.getMessage());
        }
    }
}
