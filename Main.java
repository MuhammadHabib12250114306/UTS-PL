import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        int[] data = new int[n];

        System.out.println("Masukkan angkanya : ");
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        System.out.println("Daftar angka (sebanyak " + n + " angka): ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        angkaSama cek = new angkaSama(data);
        boolean angkaSamaa = cek.cekAngkaSama();
        System.out.println("\n" + angkaSamaa);

    }
}

class angkaSama {
    private int[] data;

    public angkaSama(int[] data) {
        this.data = data;
    }

    public boolean cekAngkaSama() {
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                return true;
            }
        }
        return false;
    }
}