class testing {
    static int a;
    static int b;

    int m;
    int n;

    static {
        System.out.println("Static block");
        a = 10;
        b = 20;
    }
    {
        System.out.println("Non static block");
        m = 20;
        n = 40;
    }

    static void meth1() {
        System.out.println("Static variable a = " + a);
        System.out.println("Static variable b = " + b);
    }

    void meth2() {
        System.out.println("Non static variable m = " + m);
        System.out.println("Non static variable n = " + m);
    }

    public static void main(String[] args) {
        testing.meth1();
        testing obj = new testing();
        obj.meth2();
    }
}