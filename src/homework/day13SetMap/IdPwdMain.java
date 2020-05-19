package homework.day13SetMap;


import java.util.*;


class IdPwd {
    private String id;
    private String pwd;

    public IdPwd(String id, String pwd) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdPwd idPwd = (IdPwd) o;
        return Objects.equals(id, idPwd.id) &&
                Objects.equals(pwd, idPwd.pwd);
    }
/* 잘안돼...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdPwd idPwd = (IdPwd) o;
        return Objects.equals(id, idPwd.id) ;
    }
*/

    @Override
    public String toString() {
        return "IdPwd{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pwd);
    }
}


public class IdPwdMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<IdPwd> userInfo = new ArrayList<>();

        userInfo.add(new IdPwd("aaa", "1111"));
        userInfo.add(new IdPwd("bbb", "2222"));
        userInfo.add(new IdPwd("ccc", "3333"));
        userInfo.add(new IdPwd("ddd", "4444"));


        System.out.println("패스워드 변경서비스입니다");
        System.out.print("변경할 아이디를 입력하세요 : ");
        String userId = sc.nextLine();

/*        if (!userInfo.contains(userId)) {
            System.out.println("입력하신 아이디 [" + userId + "] 는 존재하지 않습니다.");
            System.out.println("서비스를 종료합니다.");
            System.exit(0);
        } else {
            System.out.println("존재합니다.");
        }*/


        int isContains = -1;
        for (int i = 0; i < userInfo.size(); i++) { // contains로 찾는 방법은..?
            if (userId.equals(userInfo.get(i).getId())) {
                isContains = i;
            }
        }

        if (isContains == -1) {
            System.out.println("입력하신 아이디 [" + userId + "]는 존재하지 않습니다");
            System.out.println("서비스를 종료합니다");
            System.exit(0);
        } else {
            System.out.print("현재 패스워드를 입력하세요 : ");
            String userPwd = sc.nextLine();

            if (userPwd.equals(userInfo.get(isContains).getPwd())) {
                System.out.print("변경할 패스워드를 입력하세요 : ");
                String newPassword = sc.nextLine();
                userInfo.set(isContains, new IdPwd(userId, newPassword));
//                userInfo.remove(isContains);
//                userInfo.add(new IdPwd(userId, newPassword));
                System.out.println("패스워드를 변경하였습니다");
            } else {
                System.out.println("패스워드가 올바르지 않습니다");
                System.out.println("서비스를 종료합니다");
                System.exit(0);
            }
        }

        System.out.println("< 전체 회원 목록 >");

        // Iterator는 이런식으로 사용하면 될거 같은데요....
        Iterator<IdPwd> ite = userInfo.iterator();
        while(ite.hasNext()) {
            IdPwd user = ite.next();
            System.out.println("userId: " + user.getId() + ", pwd: " + user.getPwd());
        }

        for (int i = 0; i < userInfo.size(); i++) { // iterator로 출력하는 방법은..?
            System.out.println("userId: " + userInfo.get(i).getId() + ", pwd: " + userInfo.get(i).getPwd());
        }

        System.out.println(userInfo.get(1)); //toString 메소드에 의해
    }
}

/*
        Iterator itr = userInfo.iterator();


        while (itr.hasNext()) {
            String TempId = userInfo.get()
            System.out.println(itr.next());
        }

*/
