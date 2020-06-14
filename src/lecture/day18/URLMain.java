package lecture.day18;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {
    public static void main(String[] args) {
        try {
            URL urlObj = new URL("https://www.naver.com");
//            URL urlObj = new URL("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=subway&oquery=port&tqi=UWJQblp0JXVssQ1icMNssssstwl-049247");

            System.out.println("프로토콜 : " + urlObj.getProtocol());
            System.out.println("호스트 : " + urlObj.getHost());
            System.out.println("포트 : " + urlObj.getPort());
            System.out.println("경로 : " + urlObj.getPath());
            System.out.println("쿼리 : " + urlObj.getQuery());
            System.out.println("===========================================================");

            InputStream is = urlObj.openStream();
            InputStreamReader isr = new InputStreamReader(is,"euc-kr"); //글자 단위로 받아오기 위해 필터 껴줌

            while (true) {
                int c = isr.read(); //파일의 끝을 -1로 인식
                if (c==-1) break;
                System.out.print((char)c);
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
