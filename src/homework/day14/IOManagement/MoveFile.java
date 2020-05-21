package homework.day14.IOManagement;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MoveFile extends BasicFunction {
    Scanner sc = new Scanner(System.in);

    public void moveLowerFile() {


        System.out.println("이동할 파일(폴더)를 입력해주세요. ");
        String moveFile = sc.nextLine() + "\\";
        IOpath = IOpath + moveFile;
        File file = new File(IOpath); // 이동할 폴더(파일)

        File[] fileList = file.listFiles();


        boolean isRemainDir = true;
        if (file.exists()) {

            for (File f : fileList) {

                if (!f.isDirectory()) {
                    isRemainDir = false;
                }
            }
            if (!isRemainDir) {
                showHead();
                showInsideFolder(file);
                System.out.println("이 폴더는 최하위 폴더입니다.");
            } else {
                showHead();
                showInsideFolder(file);
            }
        } else {
            System.out.println("존재하지 않는 파일(폴더)입니다.");
        }

    }

    public void moveUpperFile() {

        System.out.println("현 폴더명은? ");
        System.out.println(IOpath);
        File file = new File(IOpath); // 현재 폴더(파일)

        IOpath = file.getParent();

        if (IOpath != null) {
            if (IOpath.equals(highestPath)) { // 상수값 지정해주기

                showHead();
                showInsideFolder(file);
                System.out.println("상위폴더인 " + IOpath + "로 이동되었습니다.");
                System.out.println("이 폴더는 최상위 폴더입니다.");
            } else {
                showHead();
                showInsideFolder(file);
                System.out.println("상위폴더인 " + IOpath + "로 이동되었습니다.");
            }
        } else {
            IOpath = highestPath;
            System.out.println("더이상 상위 폴더가 없습니다.");
        }

    }
}

