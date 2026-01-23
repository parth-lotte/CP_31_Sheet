import java.io.*;
import java.util.*;

public class B_Sum_of_Medians {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        long t = fs.nextLong();

        while (t-- > 0) {
            long n = fs.nextLong();
            long k = fs.nextLong();

            int range = (int) (n * k);
            long div = n / 2;
            long sum = 0;
            int j = 0;

            long[] v = new long[range];
            for (int i = 0; i < range; i++) {
                v[i] = fs.nextLong();
            }

            for (long i = range - 1 - div; i >= 0; i -= (div + 1)) {
                sum += v[(int) i];
                j++;
                if (j == k) break;
            }

            out.append(sum).append('\n');
        }

        System.out.print(out.toString());
    }

    // Fast input reader (similar to fast I/O in C++)
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            long val = 0;
            int c;
            boolean neg = false;

            do {
                c = read();
            } while (c <= ' ');

            if (c == '-') {
                neg = true;
                c = read();
            }

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return neg ? -val : val;
        }
    }
}
