package UserPractice;

public class User {

    private String id;
    private String pwd;

    User(){};

    User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserPractice{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
