public class App {
    //Thuật toán sắp xếp tăng dần
    public static void sortASC(int[] listNumber) {
        int temp = listNumber[0];
        for (int i = 0; i < listNumber.length - 1; i++) {
            for (int j = i + 1; j < listNumber.length; j++) {
                if (listNumber[i] > listNumber[j]) {
                    temp = listNumber[j];
                    listNumber[j] = listNumber[i];
                    listNumber[i] = temp;
                }
            }
        }
    }

    //Phương thức hiển thị danh sách
    public static void showListNumber(int[] listNumber) {
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        //Tạo mảng chứ 50 phần tử
        int listNumber[] = new int[50];

        //Random 0 - 100
        RandomInt randomInt = new RandomInt(0, 100);
        System.out.println("Result: ");

        for (int i = 0; i < 50; i++) {
            listNumber[i] = randomInt.randomInterger();
        }

        //Sắp xếp và hiển thị
        sortASC(listNumber);
        showListNumber(listNumber);


    }
}
