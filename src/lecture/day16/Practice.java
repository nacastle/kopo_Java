package lecture.day16;


class Parent{

    Parent(){
        System.out.println("parent!");
    }


}

class Note extends Parent{

    Note(){

    }

    Note(int n){

        this(1,"st");
        System.out.println("n");

    }

    Note(int n, String str){

        System.out.println("n, str");


    }
}

public class Practice {

    public static void main(String[] args) {

        Parent pt = new Parent();
        System.out.println("===================");
        Note nt = new Note(2,"as");
        System.out.println("===================");
        Note nt1 = new Note(1);
        System.out.println("===================");
        Note nt0 = new Note();

    }
}
