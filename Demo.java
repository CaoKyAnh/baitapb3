import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	TamGiac tg = new TamGiac();
	Scanner sc = new Scanner(System.in);
	//Nhập cạnh 1 lớn hơn 0
	do {
		System.out.println("Nhap canh 1");
		tg.setCanh1(sc.nextDouble());
		if(tg.getCanh1()<=0)
			System.out.println("Nhap canh >0");
	} while (tg.getCanh1()<=0);
	//Nhập cạnh 2 lớn hơn 0
	do {
		System.out.println("Nhap canh 2");
		tg.setCanh2(sc.nextDouble());
		if(tg.getCanh2()<=0)
			System.out.println("Nhap canh >0");
	} while (tg.getCanh2()<=0);
	//Nhập cạnh 3 lớn hơn 0
	do {
		System.out.println("Nhap canh 3");
		tg.setCanh3(sc.nextDouble());
		if(tg.getCanh3()<=0)
			System.out.println("Nhap canh >0");
	} while (tg.getCanh3()<=0);
	//Tính Chu vi và Diện tích tam giác
	System.out.println("Chu vi va dien tich tam giac "+tg.Chuvi()+" "+tg.Dientich());
	//Phân loại tam giác
	tg.Loai(tg.getCanh1(),tg.getCanh2(),tg.getCanh3());
}
}