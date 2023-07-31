package Lesson11;

import java.util.Date;

public abstract class libActionProductList {
    private Integer idx;
    private String orderShit;
    private Date dateCreat;

    public Integer getIdx() {
        return this.idx;
    }

    public String getOrderShit() {
        return this.orderShit;
    }
    public Date getdateCreat() {
        return this.dateCreat;
    }

    public libActionProductList(Integer idx, String orderShit, Date dateCreat) {
        this.idx = idx;
        this.orderShit = orderShit;
        this.dateCreat = dateCreat;
    }
}
