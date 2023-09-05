public class TamGiac {
private double canh1,canh2,canh3;
public TamGiac(double canh1,double canh2,double canh3) {
	this.canh1=canh1;
	this.canh2=canh2;
	this.canh3=canh3;
}
public TamGiac() {
	
}
public double getCanh1() {
	return canh1;
}

public void setCanh1(double canh1) {
	this.canh1 = canh1;
}

public double getCanh2() {
	return canh2;
}

public void setCanh2(double canh2) {
	this.canh2 = canh2;
}

public double getCanh3() {
	return canh3;
}

public void setCanh3(double canh3) {
	this.canh3 = canh3;
}

double Chuvi() {
	return canh1+canh2+canh3;
}
double Dientich() {
	double p = (canh1+canh2+canh3)/2;
	return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
}
void Loai(double canh1,double canh2,double canh3) {
	if(canh1+canh2>canh3&&canh2+canh3>canh1&&canh1+canh3>canh2&&canh1>0&&canh2>0&&canh3>0) {
		if(canh1==canh2&&canh2==canh3) {
			System.out.println("Tam giac deu");
			}else if(canh1==canh3||canh1==canh2||canh2==canh3) {
				System.out.println("Tam giac can");
			}else if (canh1*canh1==canh2*canh2+canh3*canh3||canh2*canh2==canh1*canh1+canh3*canh3||canh3*canh3==canh1*canh1+canh2*canh2) {
				System.out.println("Tam giac vuong");
			}else if (canh1*canh1==canh2*canh2+canh3*canh3&&canh2==canh3||canh2*canh2==canh1*canh1+canh3*canh3&&canh1==canh3||canh3*canh3==canh1*canh1+canh2*canh2&&canh1==canh2) {
				System.out.println("Tam giac vuong can");
			}else {
				System.out.println("Tam giac thuong");
			}
}else {
	System.out.println("3 canh khong du dieu kien lap thanh tam giac");
}
}
}
