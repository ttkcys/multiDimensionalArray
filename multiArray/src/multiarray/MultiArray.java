package multiarray;

public class MultiArray {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Edirne";
        cities[0][2] = "Bursa";
        cities[1][0] = "Samsun";
        cities[1][1] = "Ordu";
        cities[1][2] = "Bartin";
        cities[2][0] = "Ankara";
        cities[2][1] = "Konya";
        cities[2][2] = "Kayseri";

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
            System.out.println("---------");
        }
    }

}
