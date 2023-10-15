package whileLoop;
import java.util.*;

class W1
{
	Scanner sc = new Scanner(System.in);
	void reverse() {

		System.out.println("Enter The number : ");
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		while(n!=0) {
			int res = n % 10;
			sum = (sum*10) + res;
			n = n / 10;
		}
		if(num == sum) {
			System.out.println("It is Palindrome Number");
		} else {
			System.out.println("It is not a Palindrome Number");
		}	}

	void neon() {
		System.out.println("Enter The number : ");
		int n1 = sc.nextInt();
		int sq =(int)Math.pow(n1, 2);
		int sum = 0;
		while(sq!=0) {
			int res = sq % 10;
			sum = sum + res;
			sq = sq / 10;
		}
		if(sum == n1) {
			System.out.println("It is a Neon Number " + sum);
		} else {
			System.out.println("It is not a Neon Number");
		}
	}

	void armstrong() {
		System.out.println("Enter The number : ");
		int n2 = sc.nextInt();
		int num = n2;
		int sum = 0;
		while(num != 0) {
			int res = num % 10;
			sum = sum + (res*res*res);
			num = num / 10;
		}

		if(n2 == sum) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("It is not a Armstrong Number");
		}
	}
	
	void primeNumber() {
		System.out.println("Enter The number : ");
//		int no = sc.nextInt();
		int nq = 1;
		while(nq <= 100) {
			int flag = 1;
			for(int i = 2; i < nq; i++) {
				if(nq % i == 0) {
					flag = 0;
				}
			}
			if(flag == 1) {
				System.out.print(nq + " ");
			} else {
				System.out.print("");
			}
			
			nq++;
		}
	}
}
public class LoopWhile01 {
	public static void main(String args[]) {
		W1 w = new W1();
//				w.reverse();
		//		w.neon();
//		w.armstrong();
		w.primeNumber();
	}
}
