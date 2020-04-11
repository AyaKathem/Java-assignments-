package AyaKathem_assing3.Exercises3_7;


	import java.util.Iterator;

	public class TreeWordSet implements WordSet {

		private BST root = null;
		private int count = 0;
		
		public void add(Word word){
			if(contains(word)) {	
				// if word is exist return 
				return;
			}
			if (root == null){ 
				//if the toot is null, add the element to root and count the size 
				root = new BST(word);
				count++;
			}else {
				root.add(word);
			}
			
		}
		
		public boolean contains(Word word){
			if(root == null){
				// if the size is null return false 
				return false; 
			}else {
				// call inner class method 
				return root.contains(word); 
			}
		}
		
		public int size(){ 
			return count;
		}
		
		public String toString(){
			return "";
		}
		
		public Iterator<Word> iterator(){
			return new treeWordIterator();
		}
		
		
		
		
		//Inner class
		private class treeWordIterator implements Iterator<Word>{
			Word[] words = new Word[count];
			int index;
			int pos;
			
			public treeWordIterator(){
				visitBST(root);
			}
			
			@Override
			public boolean hasNext() {
				while(pos < count){
			
					return true; 
				}
				//if it is empty return false 
					return false; 
				
				
			}

			@Override
			public Word next() {
				return words[pos++];
			}
			
			
			private void visitBST(BST node) {
				   if (node.l != null) {
					// visit left side
					   visitBST(node.l);   
				   }
				// in order print value
				   words[index++] = node.value;   
				   if (node.r != null) {
					// visit right side
					   visitBST(node.r);   
				   }
			}
			
		}
		
		private class BST{
			public Word value;
			public BST l = null;
			public BST r = null;
			
			BST(Word word){
				value = word;
			}
			
			void add(Word word){
				
				if(word.compareTo(value) < 0){
					if(l == null){
						l = new BST(word);
						count++;
					}else {
						l.add(word);
					}
				}else if(word.compareTo(value) >= 1){
					if(r == null){
						r = new BST(word);
						count++;
					}else{
						r.add(word);
					}
				}
			}
			
			
			private boolean contains(Word word){
				
					if(l == null)
						return false;
					else
						return l.contains(word);
				
				
				
			}}}
