import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh a cua tam giac");
        double side1 = sc.nextDouble();
        System.out.println("Nhap vao canh b cua tam giac");
        double side2 = sc.nextDouble();
        System.out.println("Nhap vao canh c cua tam giac");
        double side3= sc.nextDouble();
    try {
        checkSideTriangle(side1);
        checkSideTriangle(side2);
        checkSideTriangle(side3);
        checkTriangle(side1,side2,side3);
        checkTriangleVuong(side1,side2,side3);
    } catch (CheckTriangle checkTriangle) {
        System.out.println(checkTriangle.getMessage());
    }
    }
    public static void checkSideTriangle(double side) throws CheckTriangle {
        if (side<=0){
            throw new CheckTriangle("Khong phai la canh tam giac");
        }

    }
    public static void checkTriangle(double side1, double side2, double side3) throws CheckTriangle {
        if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1){
            throw new CheckTriangle("Khong phai la tam giac");
        }
    }
    public static void checkTriangleVuong(double side1,double side2,double side3) throws CheckTriangle {
        if ((Math.pow(side1,2) +Math.pow(side2,2))!=Math.pow(side3,2)
        && (Math.pow(side1,2) +Math.pow(side3,2))!=Math.pow(side2,2)
        && (Math.pow(side3,2) +Math.pow(side2,2))!=Math.pow(side1,2)){
            throw new CheckTriangle("Khong phai la tam giac vuong");
        }
    }
}
