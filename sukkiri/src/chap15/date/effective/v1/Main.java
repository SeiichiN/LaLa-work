package chap15.date.effective.v1;

import java.util.Date;

/**
 * Dateクラスは、不変ではない。
 * chap15.date.effective.v4パッケージのコードと比べてみるとよい。
 * これは、LocalDateクラスである。
 * chap15.date.effective.v2 & v3 は 「effective Java」に載っていた
 * コードである。 
 * @author se-ichi
 *
 */
public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date(start.getTime() + 24*60*60*1000);
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        System.out.println("end-hashcode:" + end.hashCode());
        
        Period p = new Period(start, end);
        System.out.println("period:" + p.start() + ":" + p.end());
        System.out.println("period-hashcode:" + p.end().hashCode());
        
        // このsetYear() メソッドを使うと endのハッシュコードが変わる。
        // これは、別のインスタンスに変わったてことか。
        end.setYear(78);
        System.out.println("end:" + end);
        System.out.println("end-hashcode:" + end.hashCode());
        System.out.println("period:" + p.start() + ":" + p.end());
        // Periodクラスのフィールドもこのインスタンスへの参照に変わっている
        System.out.println("p.end-hashcode:" + p.end().hashCode());
    }
}

// 修正時刻: Mon 2022/06/06 08:02:44
