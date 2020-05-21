package lecture.day15;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private transient int age;  //transient: 객체직렬화에서 이 필드는 제외하고 줄세우기
    private String addr;

    public UserInfo() {
        super();
    }

    public UserInfo(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
