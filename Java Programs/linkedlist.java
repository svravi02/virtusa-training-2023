public class Main
{
    Node head=null;
    class Node{
        int data;
        Node next=null;
        
        public Node(int data){
            this.data=data;
            this.next=next;
        }
        }
        public void addNodeAtTheBeginning(int data){
            System.out.println("Add a node with data " + data + " at the beginning.");
            Node newNode=new Node(data);
            if(head==null)
            head=newNode;
            else{
                newNode.next=head;
                head=newNode;
            }
        }
        
    public void addNodeAtTheEnd(int data){
        System.out.println("Add a node with data " + data + " at the end.");
            Node newNode=new Node(data);
            if(head==null)
            head=newNode;
            else{
                Node cur=head;
                while(cur.next!=null){
                cur=cur.next;
                }
                cur.next=newNode;
            }
        }
         public void add(int position,int data){
        System.out.println("Add a node with data " + data + " at the position " + position); 
            Node newNode=new Node(data);
            if(position==1){
            newNode.next=head;
            head=newNode;
            }
            else{
               Node cur=head,prev=head;
               while(cur.next!=null && --position>0){
                   prev=cur;
                   cur=cur.next;
               }
               prev.next=newNode;
               newNode.next=cur;
            }
        }
        public void delete(){
            System.out.println("Deletion from the beginning");
            if(head==null)
            System.out.println("The List is empty.");
            else
            head=head.next;
        }
        public void deleteend(){
            Node cur=head;
            while(cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
        }
        public void deletemiddle(int pos){
             System.out.println("Deletion from the middle");
            Node temp=head;
            for(int i=2;temp!=null && i<pos;i++){
                    temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        public void sort(Node head){
            	System.out.println("Sorted list ");
            Node c=head;
            Node index=null;
            int t;
            if(head==null)
            return;
            else{
                while(c!=null){
                    index=c.next;
                    while(index!=null){
                        if(c.data>index.data){
                            t=c.data;
                            c.data=index.data;
                            index.data=t;
                        }
                        index=index.next;
                    }
                    c=c.next;
                }
            }
        }
        public void print(){
            
                if(head==null)
                	System.out.println("The List is empty.");
                else{
                    Node cur = head;
			while (cur!= null) {
				System.out.print(cur.data + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
                }
            }
            boolean search(Node head,int k){
                Node c=head;
                while(c!=null){
                    if(c.data==k)
                    return true;
                    c=c.next;
                    
                }
                return false;
            }
        
	public static void main(String[] args) {
		Main list = new Main();
        System.out.println("Created a singly linked list .....");
	    list.print();
		list.addNodeAtTheBeginning(100);
	    list.print();
		list.addNodeAtTheBeginning(200);
		list.print();
      	list.addNodeAtTheEnd(900);
	    list.print();
		list.addNodeAtTheEnd(800);
		list.print();
        list.add(1,150);
        list.print();
        list.add(4,250);
        list.print();
        list.add(6,250);
        list.print();
        list.deletemiddle(6);
        list.print();
        list.sort(list.head);
        list.print();
        if(list.search(list.head,90000))
        System.out.println(900+" found");
        else
        System.out.println("element  not found");
        
	}
}

