public class _task1 {
    public static void main(String[] args) throws Exception {
        Tv myTv = new Tv("LG", 017, 32);
        myTv.show();
    }
}

class Tv {
    private String name;
    private int year;
    private int size;

    public Tv() {
        this("no named", 0, 0);
    }

    public Tv(String name, int year, int size) {
        this.name = name;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(this.name + " " + this.size + "-inch TV manuactured in " + this.year);
    }
}