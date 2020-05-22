package homework.day14.BoardByList;

// 죄송합니다 교수님...코드가 좀 많이 더럽습니다...나중에 같은 실수를 하지 않으려고 일부러 틀린 코드들에 대한 흔적을 남겨놨습니다.

import java.text.SimpleDateFormat;
import java.util.Date;


public class Post {

    private int postNum;
    private String postTitle;
    private String postWriter;
    private String postDate;

    @Override
    public boolean equals(Object obj) {
        Post p = (Post)obj;
        if(this.postNum == p.postNum) {
            return true;
        }
        return false;
    }

    public Post() {

    }

    public Post(int postNum, String postTitle, String postWriter) {
        this.postNum = postNum;
        this.postTitle = postTitle;
        this.postWriter = postWriter;

        SimpleDateFormat postFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm");
        Date date = new Date();
        String postDate = postFormat.format(date);

        this.postDate = postDate;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostWriter() {
        return postWriter;
    }

    public void setPostWriter(String postWriter) {
        this.postWriter = postWriter;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}
