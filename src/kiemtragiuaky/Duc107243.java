package kiemtragiuaky;

public class Duc107243 {
    public static void hienThiMang_a()
    {
        int a[][] = {{1, 3}, {6, 5, 9}, {4, 6}};
        System.out.println("Cau 2: Cac phan tu cua mang a: ");
        // Lấy vị trí hàng của mảng a
        for (int i = 0; i < a.length; i++)
        {
            // Lấy vị trí cột của mảng a
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void hienThiMang(int b[])
    {
        System.out.println("Cau 3.1: Cac phan tu cua mang b: ");
        for (int i = 0; i < b.length; i++)
        {
            System.out.printf(b[i] + "\t");
        }
        System.out.println();
    }

    public static int timMax(int b[])
    {
        int max = b[0];
        // Duyệt qua từng phần tử để so sánh với max
        for (int i = 1; i < b.length; i++)
        {
            if (b[i] > max)
            {
                max = b[i];
            }
        }
        return max;
    }

    public static int tinhTongChan(int b[])
    {
        // Khởi tạo biến tong kiểu int và gán tong = 0
        int tong = 0;
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] % 2 == 0)
            {
                tong += b[i];
            }
        }
        return tong;
    }

    public static void hienThiPhanTuMin5(int b[])
    {
        System.out.print("Cau 3.4: Cac phan tu nho hon 5 cua mang b: ");
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] < 5)
            {
                System.out.printf(b[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int b[] = {3, 5, 6, 8, 10, 14, 17, 19, 20};
        hienThiMang_a();
        hienThiMang(b);
        System.out.println("Cau 3.2: Phan tu lon nhat cua mang b la: " + timMax(b));
        System.out.println("Cau 3.3: Tong cac phan tu chan cua mang b la: " + tinhTongChan(b));
        hienThiPhanTuMin5(b);
    }
}