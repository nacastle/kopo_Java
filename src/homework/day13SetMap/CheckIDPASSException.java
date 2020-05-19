package homework.day13SetMap;



public class CheckIDPASSException extends Exception {

    private static String [] errMsg = {"", "아이디가 올바르지 않습니다", "패스워스가 잘못되었습니다"};

    public CheckIDPASSException() {
    }

    public CheckIDPASSException(String message) {
        super(message); // 부모 타고 들어가면 print가 있어서
    }

    public CheckIDPASSException(int errorCode) {
        this(errMsg[errorCode]);
    }

}










