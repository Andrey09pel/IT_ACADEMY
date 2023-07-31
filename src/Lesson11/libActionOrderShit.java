package Lesson11;

import java.util.Date;

public class libActionOrderShit {
    private Integer idx;
    private String name;
    private Date dateBeg;

    public Integer getIdx() {
        return this.idx;
    }

    public String getName() {
        return this.name;
    }
    public Date getdateBeg() {
        return this.dateBeg;
    }

    public libActionOrderShit(Integer idx, String name, Date dateBeg) {
        this.idx = idx;
        this.name = name;
        this.dateBeg = dateBeg;
    }
}
