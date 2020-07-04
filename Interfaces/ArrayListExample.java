/* An implementation of ArrayList */

import java.util.ArrayList;

public class ArrayListExample { 
	private ArrayList arrayList;

	public ArrayListExample() { 
		arrayList = new ArrayList();
	}

	private ArrayList getList() {
		return arrayList;
	}

	public static void main(String[] args) {
		ArrayListExample listExample = new ArrayListExample();
		ArrayList list = listExample.getList();
		System.out.println(list);
	}
}