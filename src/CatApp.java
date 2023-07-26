import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CatApp {

	public static void main(String[] args) {
		System.out.println("***猫集め***");

		Scanner s = new Scanner(System.in);
		Random r = new Random();

		ArrayList<String> cat = new ArrayList<String>();
		cat.add("白猫");
		cat.add("黒猫");
		cat.add("茶トラ猫");

		List<Cat> catList = new ArrayList<Cat>();

		while (true) {
			System.out.print("1.集める 2.遊ぶ 3.終了 >>");
			int select = s.nextInt();
			switch (select) {

			case 1:
				int kind = r.nextInt(cat.size());
				System.out.println(kind + "を見つけた！");
				String name = s.nextLine();
				System.out.println("この猫に名前をつけてください >>");
				System.out.println(name + "が仲間に加わった!");
				Cat cats = new Cat(name, kind);

				break;

			case 2:
				if (catList.size() > 0) {
					for(int i=0; i<catList.size(); i++) {
						System.out.printf();
					}
				}else {
					System.out.println("まだ遊ぶ猫がいません。。。");	
				}
					
				break;

			case 3:

			}
		}

	}

}
