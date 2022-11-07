package WS;

import java.util.Date;

public class Compte {

    private int code;
    private double mt;
    private Date date;

    public Compte(int code, double mt, Date date) {
        this.code = code;
        this.mt = mt;
        this.date = date;
    }

    public Compte(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMt() {
        return mt;
    }

    public void setMt(double mt) {
        this.mt = mt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
