import java.util.*;

public class Main2 {
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

        angkaSama2 angka = new angkaSama2(data);
        angka.tampilkanAngkaSama();
    }
}

class angkaSama2 {
    private int[] data;

    public angkaSama2(int[] data) {
        this.data = data;
    }

    public void tampilkanAngkaSama() {
        Map<Integer, Integer> jumlahAngkaSama = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (jumlahAngkaSama.containsKey(data[i])) {
                jumlahAngkaSama.put(data[i], jumlahAngkaSama.get(data[i]) + 1);
            } else {
                jumlahAngkaSama.put(data[i], 1);
            }
        }

        System.out.println("\nDaftar angka yang sama beserta jumlahnya : ");
        for (Map.Entry<Integer, Integer> angka2 : jumlahAngkaSama.entrySet()) {
            if (angka2.getValue() > 1) {
                System.out.println("Angka " + angka2.getKey() + " ada " + angka2.getValue());
            } else {
                System.out.println("Tidak ada");
                break;
            }
        }
    }
}
