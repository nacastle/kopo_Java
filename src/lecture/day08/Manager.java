package lecture.day08;

public class Manager extends Employee {

    private Employee[] empList;

    public Manager() {
    }

    public Manager(int no, String name, String grade, int salary, Employee[] empList) {
        super(no, name, grade, salary);
        this.empList = empList;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public void info() {
        super.info();   // 자식 메소드 info()와 부모 메소드 info()의 이름이 같으니 super 명시 필수
        System.out.println("======================================================");
        System.out.println("\t\t< 관리 사원 목록 >");
        System.out.println("======================================================");
        for( Employee e : empList ) {
            e.info();
        }

        System.out.println("======================================================");
    }


}