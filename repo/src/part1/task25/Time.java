package part1.task25;

public class Time {

    public static int sec2;

    public static int sec1;

    public  int sec;

    public  int min;

    public int hou;

    public Time(int sec, int min, int hou) {
        this.sec = sec;
        this.min = min;
        this.hou = hou;
    }

    public Time( int sec2) {
        this.sec2 = sec2;

    }

    public int getallSec() {
        int sec1 = this.hou * 3600 + this.min * 60 + this.sec;
        return sec1;
    }

    public int getSec() {
        return sec2;
    }


    public  void compareTo() {
        Integer obj1 = new Integer(sec1);
        Integer obj2 = new Integer(sec2);
        int res = (obj2.compareTo(obj1));
        if (res > 0){
            System.out.println("obj1 is larger then obj2");
        }else if (res < 0) {
            System.out.println("obj2 is larger then obj1");
        }else{
            System.out.println("obj1 & obj2 are equal");
        }

        }
   }



