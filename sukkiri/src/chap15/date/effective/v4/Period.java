package chap15.date.effective.v4;

import java.time.LocalDate;

public final class Period {
    private final LocalDate start;
    private final LocalDate end;

    public Period(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
        System.out.println("Period-end-hashcode:" + this.end.hashCode());
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }
    }

    public LocalDate start() {
        return start;
    }

    public LocalDate end() {
        return end;
    }
}


// 修正時刻: Mon 2022/06/06 07:47:34
