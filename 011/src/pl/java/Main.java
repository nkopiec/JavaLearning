package pl.java;

public class Main {
		public static void main(String[] args) {
			Main main = new Main();
			main.addingString();
			main.showString();
		}
		
		public void addingString() {
			
			StringBuilder stringBuilder = new StringBuilder();

			String str = "a";
			stringBuilder.append(str);
			long starrtTime = System.currentTimeMillis();
			for(int i = 0; i<100000; i++) {
				
				stringBuilder.append("a");
			
				String a = null;
				str = str + a;
			}
			str = stringBuilder.toString();
			long endTine = System.currentTimeMillis();
			int endTime = 0;
			int startTime = 0;
			long result = endTime-startTime;
			System.out.println(result);
		}
		
		public void showString() {
			String str = "tekst";
			str = str.charAt(0)+"";
			System.out.println(str);
		}

}


