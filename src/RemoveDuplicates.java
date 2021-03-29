
public class RemoveDuplicates {
	IntNode original_list;
	int length;
	
	public RemoveDuplicates() {
		original_list=null;
		length=0;
	}
	
	public RemoveDuplicates(IntNode original_list, int length) {
		this.original_list=original_list;
		this.length=length;
	}
	
	public void add(int a) {
		IntNode newNode=new IntNode(a);
		
		IntNode temp=original_list;
		if(original_list==null) {
			original_list=newNode;
			length++;
			return;
		}//if no ele in the list, add the newNode as first and last node in the list
		
		if(original_list.getData()>a) {
			newNode.setNext(original_list);
			original_list=newNode;
			length++;
			return;
		}//if the newNode's data is smaller than the first one in list, set the newNode as first.
		
		while(temp!=null) {

			if(temp.getNext()==null) {
				temp.setNext(newNode);
				length++;
				return;
			}
			
			if(temp.getData()<=a && temp.getNext().getData()>=a) {
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				length++;
				return;
			}//find the position for the newNode to add inside the list
			
			temp=temp.getNext();//update cursor
		}
	
	}//end of add
	
	public void remove(int a) {
		IntNode temp=original_list;
		
		if(temp==null) {
			System.out.println("\nNone Exist");
			return;
		}//if the list is empty
		
		if(temp.getData()==a&&temp==original_list) {
			original_list=original_list.getNext();
			length--;
			return;
		}
		
		while(temp!=null) {
			if(temp.getNext()==null){
				System.out.println("\nNot Found");
				return;
			}

			if(temp.getNext().getData()==a) {
				temp.setNext(temp.getNext().getNext());
				length--;
				return;
			}
			
			temp=temp.getNext();
		}
		
	}//end of remove
	
	public void remove_duplicates() {
		IntNode temp=original_list;
		
		if(temp==null) {
			System.out.println("None Exist");
			return;
		}
		
		if(length==1)
			return;
		
		int count=0;//count # of duplicates
		IntNode temp2=temp.getNext();
		while(temp2!=null) {
			
			while(temp.getData()==temp2.getData()&&temp2.getNext()!=null) {
				temp2=temp2.getNext();
				count++;
			}//compare the data of temp node with linked nodes until the it's not the same or
			//reached the end of list, keep updates number of duplicates
				
			if(temp2.getNext()==null&&temp.getData()==temp2.getData()) {
				temp.setNext(null);
				length-=++count;//count in the last node
				return;
			}//if reached the end of list and the last node is also a duplicate, remove all of them
			
			temp.setNext(temp2);//link the temp node with first non-duplicate node

			temp=temp.getNext();
			temp2=temp.getNext();
		}
		length-=count;//remove duplicates# from total length of the list
		return;
	}
	
	public String toString() {
		IntNode temp=original_list;
		String s="";
		
		while(temp!=null) {
			s+=temp.getData()+" ";
			temp=temp.getNext();
		}
		return s;
	}//end of toString

	
	public IntNode getLsit() {
		return original_list;
	}

}
