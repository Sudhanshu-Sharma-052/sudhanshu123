public class Finddublicate {
   //Scanner x=new Scanner(System.in);
		int a[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

		for (int i = 0; i <a.length; i++) {
			a[a[i] % a.length]= a[a[i] % a.length]+ a.length;
		}
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= a.length * 2) {
				System.out.println(i + " ");
			}
		}
	}


