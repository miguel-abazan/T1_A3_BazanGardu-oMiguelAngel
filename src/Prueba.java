class Operaciones{
	
	String a[];
	String b[];
	String a1;
	String b1;
	
	//Rellenar Arreglos

	public static boolean primos(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	public void primos() {
		String primos ="";
		for (int i=0; i<=100 ;i++) {
			if (primos(i)) {
				primos = primos+","+i;
			}
		}
		a1=primos;
		a = primos.split(",");
	}

	public void Divisores() {
		String divisores = "";
		int num = 350;
		for(int i = 1;i<=num;i++){
			if (num % i== 0){
				divisores = divisores+","+i;
			}
		}
		b1 = divisores;
		b = divisores.split(",");
		
	}
	

	public void union() {
		int u = 0;
		String un = "";
		String b2 = "";
		
		for (int i = 1; i < b.length; i++) {
			b2 = b2+b[i]+",";
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					
				} else {
					u=u+1;
				}
			}
			if (u==b.length) {
				un = un + a[i]+",";
			} 
			u = 0;
		}
		un = un + b2;
		System.out.println(un);
		
	}

	public void interseccion() {
		int m = 0;
		String in = "";
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					
				} else {
					m=m+1;
				}
			}
			if (m<b.length) {
				in = in + a[i]+",";
			} 
			m = 0;
		}
		
		System.out.println(in);
		
	}
}
	
public class Prueba {

	public static void main(String[] args) {

		Operaciones op = new Operaciones();
		
		op.primos();
		op.Divisores();
	
		System.out.println("A: "+op.a1+"\nB: "+op.b1+"\n");
		
		System.out.print("Union: ");
		op.union();
		System.out.print("interseccion: ");
		op.interseccion();
		

	}

}
