public class Main {
    public static void main(String[] args) {
        LL list = new LL() ;
        list.insetFirst(3);
        list.insetFirst(2);
        list.insetFirst(8);
        list.insetFirst(17);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88, 1);
        list.display();


//        DLL list = new DLL() ;
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 75);
//
//        list.display();


//        CLL list = new CLL();
//        list.insert(3);
//        list.insert(4);
//        list.insert(7);
//        list.display();
//        list.delete(4);
//        list.display();
    }
}