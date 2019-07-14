package pl.sda.academy.javalon1.service.subpackage;

class B extends A {
    int x;
    int y;
    int z;

    public B(int x){
        this(x, 0, 0);
        System.out.println("1 arg");
    }

    public B(int x, int y){
        this(x, y, 0);
        System.out.println();
    }

    public B(int x, int y, int z){
            super(x, y, z);
            System.out.println("3 arg");
    }
}
