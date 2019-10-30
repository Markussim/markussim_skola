package methods;

public class classeslol {
    public static void main(String[] args) {
        testingClass testingObj = new testingClass();
        System.out.println(testingObj.hahaMethod(100));
    }
}

class testingClass {
    public int hahaMethod(int haha) {
        System.out.println("This prints something");
        return haha;
    }
}
