package lecture.day14IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

    public static void main(String[] args) {

        /*
        File fileobj = new File("iotest\\aaa.txt"); //경로 안 써주면 java폴더(IdeaProjects) 내에 있는 파일을 말한다.
//        File fileobj = new File("C:\\Users\\HP\\IdeaProjects\\kopo\\iotest\\aaa.txt"); //경로 안 써주면 java폴더(IdeaProjects) 내에 있는 파일을 말한다.

        System.out.println("name : " + fileobj.getName()); //name = child
        System.out.println("parent : " + fileobj.getParent()); //parent
        System.out.println("path : "+ fileobj.getPath());
        System.out.println("절대경로 : " + fileobj.getAbsolutePath()); // 경로 전체

        boolean bool0 = fileobj.exists();
        System.out.println(bool0 ? "존재" : "존재안함");

        boolean bool = fileobj.isFile(); //존재안하기에 의미가 없어..다 false 로 나올것임
        System.out.println(bool ? "파일입니다" : "디렉토리입니다");

        boolean bool2 = fileobj.isDirectory();
        System.out.println(bool2 ? "디렉토리입니다." : "파일입니다.");

        long length = fileobj.length();
        System.out.println("파일크기 : " + length + "byte(s)");

        long lastTime = fileobj.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("마지막 수정시간: " + sdf.format(new Date(lastTime)));

        boolean bool3 = fileobj.canWrite();
        System.out.println(bool3 ? "쓰기 가능" : "쓰기 불가능");

        boolean bool4 = fileobj.canRead();
        System.out.println(bool4 ? "읽기 가능" : "읽기 불가능");

*/
        File dirObj = new File("iotest");

        boolean bool = dirObj.exists();
        System.out.println(bool? "유효한 디렉토리" : "디렉토리 없음");

        String[] list = dirObj.list();
        System.out.println("-----------------------------------");
        System.out.println("\t" + dirObj.getName() + "디렉토리 정보");
        System.out.println("-----------------------------------");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("-----------------------------------");

        File newDirObj = new File("iotest/하마");
        System.out.println(newDirObj.mkdir() ? "dir 생성 성공" : "dir 생성 실패");

        newDirObj = new File("iotest/새폴더/오리"); // 새폴더라는 dir가 없어서 오리 dir를 만들수 없는것 => mkdirs로 하면 가능
        System.out.println(newDirObj.mkdirs() ? "dir 생성 성공" : "dir 생성 실패");

//        newDirObj = new File("iotest");
        boolean bool4 = newDirObj.delete();
        System.out.println(bool4 ? "삭제성공":"삭제실패"); // dir 안에 파일이 있으면 삭제 불가


    }
}
