package ak223ej_assign1.intCollection;

public class collectionMain {
	public static void main(String[] args) {
  
		//create an object of ArrayIntList
		ArrayIntList arrayList = new ArrayIntList();
	for (int i = 1; i< 10;i++){
		arrayList.add(i);	
	}	
	
		arrayList.addAt(3, 4);
		
		System.out.println(arrayList.toString());
		
		arrayList.addAt(50, 5);
		arrayList.remove(6);
		arrayList.remove(7);
		System.out.println("Size: "+arrayList.size);

		System.out.println(arrayList.toString());
		System.out.println("Index of "+ 50+": " + arrayList.indexOf(50));
		
		arrayList.remove(3);
		arrayList.size();
		

		System.out.println(arrayList.toString());
		
		System.out.println("Index of "+ 5 +": " + arrayList.indexOf(5));
		//create an object of ArrayIntStack
		ArrayIntStack arrayStack = new ArrayIntStack();
		for (int i =0; i< 10 ;i++){
		arrayStack.push(i);
		}
		System.out.println(arrayStack.toString());
		arrayStack.pop();
		arrayStack.pop();
		arrayStack.pop();
		System.out.println(arrayStack.toString());
		System.out.println("Peek: " + arrayStack.peek());
		System.out.println(arrayStack.toString());
		System.out.println("Size of array list: "+ arrayStack.size());
		System.out.println(arrayStack.isEmpty());

	}

}

