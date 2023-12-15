
public class ArietmetickaSredina {
	int a;
	int b;
	int c;


ArietmetickaSredina(int a, int b, int c){
	this.a =a ;
	this.b = b;
	this.c = c;
}

void calculateAS() {
	System.out.println((a+b+c)/3);
}
public static void main(String []args) {
	ArietmetickaSredina firstN = new ArietmetickaSredina(3,5,7);
	ArietmetickaSredina secondN = new ArietmetickaSredina(13,25,29);
	firstN.calculateAS();
	secondN.calculateAS();
	}
}
