package AbdulBariInner;

class MyStatic {
	int x =  10;
	static int y = 20;
	
	static class My {
		public void show() {
			System.out.println(y);
		}
	}
}

public class StaticInner {
	public static void main(String[] args) {
		MyStatic.My m = new MyStatic.My();
		m.show();
	}
}
