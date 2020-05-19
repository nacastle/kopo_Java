package lecture.day14IO;


// iotest/disney.png 가져오기 (인풋, 입력) --> iotest/disney2.png 복사 (아웃풋, 출력)
/*
    작업순서
    1. 스트림 open
    2. 작업 수행(read, write)
    3. 스트림 close
*/


import java.io.*;

public class FileIOMain02 {

    public static void main(String[] args) {

        //FileInputStream /FileOutputStream 에서 이야기한 것처럼, 1 Byte 단위로 입/출력이 이루어지면 기계적인 동작이 많아지므로 효율이 떨어지게 된다.
        //
        //또한, 사용자가 일일이 버퍼와 크기를 지정하여 입출력을 하게 되는 것도 정적이고 불편하다.
        //
        //BufferedInputStream을 통하여 원하는 자료를 1바이트 단위로 읽는 read() 메소드를 수행하면 시스템 내부적으로 버퍼를 준비하고 이 버퍼를 이용하여 지정된 파일로부터 버퍼의 크기만큼 한꺼번에 많은 데이터를 가져온다.
        //


        FileInputStream fis = null;
        FileOutputStream fos = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //1단계: 스트림 open
            fis = new FileInputStream("iotest\\disney.png"); // 인풋
            fos = new FileOutputStream("iotest\\disney2.png"); // 아웃풋

            // filterclass 인 BufferedInputStream, BufferedOutputStream 객체 생성
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);


            long start = System.currentTimeMillis();


            //2단계: 작업 수행(Read, Write)
            while (true) {
                int c = bis.read();
                if (c==-1) {
                    break;
                }
                bos.write(c);
            }

            long end = System.currentTimeMillis();

            System.out.println("복사가 완료되었습니다.");
            System.out.println("소요시간 : " + (end - start) / 1000. + "초");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //3단계: 스트림 close

            try {
                if(bis != null) {
                    bis.close(); // try 블럭 수행하고 이미 사라진 변수
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
