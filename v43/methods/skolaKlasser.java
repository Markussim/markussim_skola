package methods;

public class skolaKlasser {
    public static void main(String[] args) {
        lol();
        System.out.println(max(1, 2));
        count(10);
        System.out.println(kelvin(100));
        System.out.println(fahrenheitToCelsius(50));
        ageControl(17);
        stair(10);
    }
    public static int max(int ha, int ha2) {
        if(ha>ha2) {
            return ha;
        }
        else {
            return ha2;
        }
    }
    public static void count(int n) {
        for (int i = 0; i<=n; i++) {
            System.out.println(i);
        }
    }
    public static void lol() {
        System.out.println("HAHAHHAHAHAHHAHHAHAHHAHAHAHHAHA");
    }
    public static int kelvin(int ha) {
        ha +=273.15;
       return ha;
    }
    public static double fahrenheitToCelsius(double ha) {
        ha += -32;
        ha = ha/1.8;
        return ha;
    }
    public static void ageControl(int ha) {
        if(ha<=5) {
            System.out.println("Småbarn får inte göra något.");
        }
        else if(ha<=12) {
            System.out.println("Du får spela Fortnite.");
        }else if(ha<=14) {
            System.out.println("Du är tonåring.");
        }else if(ha<=17) {
            System.out.println("Du får köra moppe.");
        }else if(ha<=20) {
            System.out.println("Du får köra bil.");
        }else if(ha<=64) {
            System.out.println("Du får vuxenstraff om du gör något dumt.");
        }else if(ha<=99) {
            System.out.println("Du är pensionär.");
        }else {
            System.out.println("R.I.P?");
        }
    }
    public static void stair(int steps) {
        char x = 'X';
        char y = ' ';
        int ha = 1;
        for (int i = 0; i <= steps; i++) {
            for (int andraj = ha; andraj<=steps; andraj++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(x);
            }
            ha++;
            System.out.println();
        }
    }
}
