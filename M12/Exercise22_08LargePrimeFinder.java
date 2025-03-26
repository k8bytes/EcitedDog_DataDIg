import java.io.*;
import java.util.ArrayList;

public class LargePrimeFinder {
    public static final String FILE_NAME = "PrimeNumbers.dat";
    public static final long LIMIT = 10_000_000_000L;
    public static final int CHUNK_SIZE = 10_000;

    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            long nextNumber = 2;

            // resume from the last prime in the file
            if (raf.length() > 0) {
                raf.seek(raf.length() - 8); // Each long = 8 bytes
                nextNumber = raf.readLong() + 1;
            }

            System.out.println("Starting from: " + nextNumber);

            for (long n = nextNumber; n <= LIMIT; n++) {
                if (isPrime(n, raf)) {
                    raf.seek(raf.length());
                    raf.writeLong(n);
                    System.out.println("Prime found: " + n);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPrime(long number, RandomAccessFile raf) throws IOException {
        long filePointer = 0;
        byte[] buffer = new byte[CHUNK_SIZE * 8]; // chunk of 10,000 longs

        while (filePointer < raf.length()) {
            raf.seek(filePointer);
            int bytesRead = raf.read(buffer);
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(buffer, 0, bytesRead));

            for (int i = 0; i < bytesRead / 8; i++) {
                long prime = dis.readLong();
                if (prime * prime > number) return true;
                if (number % prime == 0) return false;
            }

            filePointer += bytesRead;
        }

        return true;
    }
}
