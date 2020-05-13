package homework.day12.Board;

import java.awt.*;
import java.util.Calendar;

public class Board {

//    private Board boardList[];
    private int num; //글번호 (생략가능할수도)
    private String title; // 글제목
    private String writer; // 글쓴이
    private String postDate; // 등록일

    Board() {
    }

    Board(int num, String title, String writer, String postDate) {
    }


    public int getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getPostDate() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int day = c.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토)
        String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        postDate = year+"년" + month+"월" + date +"일" + day +"요일";
        return postDate;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}
