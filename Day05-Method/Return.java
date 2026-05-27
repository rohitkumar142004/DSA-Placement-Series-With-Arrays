package Method;

public class Return {
    static void main(String[] args) {
        raftar(25);

    }

    static int raftar(int x) {
        System.out.println("Badshan gian hai");
        if(x<15) return x;
        System.out.println("Gian");
        return x*x;
    }
}
