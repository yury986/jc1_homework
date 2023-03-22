package part1.task6;

public class Time {
    public static void main(String[] args) {
        int s = 1662565;
        int sec;
        int m, min;
        int h, hour;
        int d, day;
        int w, week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) /7;
        week = w % 7;
        System.out.println(week + "недели" + " " + day  + "суток" + " " + hour + "часов" + " " + min + "минут" + " " + sec + "секунд");


    }
}
