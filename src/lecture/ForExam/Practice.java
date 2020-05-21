package lecture.ForExam;

class Parent {

    int n1 = 100;
    int n2 = 200;

    Parent() {
        System.out.println("parent!");
    }

    Parent(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


}

class Note extends Parent {

    int n1;
    int n2;

    Note() {


    }

    protected Note(int n1, int n2) {

        super(n1, n2);


//        this(1,"st");
//        System.out.println("n");

    }

//    Note(int n, String str){
//
//        System.out.println("n, str");
//
//
//    }
}
//class Main {
//    String name  =  "길동이";
//}

public class Practice {

    public static void main(String[] args) {

        Note nt1 = new Note(1,2);
        System.out.println();


//        Main m = new Main();
//
//        System.out.println( m.name );

//        Parent pt = new Parent();
//        System.out.println("===================");
//        Note nt = new Note(2,"as");
//        System.out.println("===================");
//
//        System.out.println("===================");
//        Note nt0 = new Note();
//
//        System.out.println("===================");
//
//        Note nt1 = new Note(1);
//        nt1 = new Note(2);
//
//        System.out.println(nt1.n);

    }
}
