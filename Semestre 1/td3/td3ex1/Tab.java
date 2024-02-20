package td3;
import java.util.Scanner;

public class Tab {
	private static int NMAX = 40;
	
	void setNb(int nb) {
		NMAX = nb;
	}
	static void remplir(float t[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<NMAX ;i++) {
			System.out.println("["+i+"] = ");
			t[i] = sc.nextFloat() ;
		}
	}
	
	static float somme_element (float t[]) {
		float S = 0;
		for(int i=0; i<NMAX ;i++) {
			S += t[i] ;
		}
		return S;
	}
	
	static float[] additionner(float t1[], float t2[]){
		float[] t3 = new float[NMAX];
		for (int i=0;i<NMAX;i++) {
			t3[i] = t1[i] + t2[i];
		}
		return t3;
	}
	static float[] produit(float x,float t[]) {
		float[] t3 = new float[NMAX];
		for (int i=0;i<NMAX;i++) {
			t3[i] = t[i] * x;
		}
		return t3;
	}
	static void lister(float t[]){
		for (int i=0;i<NMAX;i++) {
			System.out.println(t[i]+"|");
		}
	}
}
