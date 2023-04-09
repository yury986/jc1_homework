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

    public Time( int sec1) {
        this.sec1 = sec1;

    }

    public int getallSec() {
        int sec2 = this.hou * 3600 + this.min * 60 + this.sec;
        return sec2;
    }

    public int getSec() {
        return sec1;
    }


    public int compareTo() {
        Integer obj1 = new Integer(sec2);
        Integer obj2 = new Integer(sec1);
        int res = (obj2.compareTo(obj1));
        return (res);

        }
   }



