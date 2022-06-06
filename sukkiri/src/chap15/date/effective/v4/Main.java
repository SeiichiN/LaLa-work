package chap15.date.effective.v4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(1);
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        System.out.println("end-hash:" + end.hashCode());
        
        Period p = new Period(start, end);
        System.out.println("period:" + p.start() + ":" + p.end());
        
        // end = LocalDate.of(1978, 1, 2);
        end = end.plusDays(1);
        System.out.println("end:" + end);
        System.out.println("end-hash:" + end.hashCode());
        System.out.println("period:" + p.start() + ":" + p.end());
    }
}

// 修正時刻: Mon 2022/06/06 08:02:44
