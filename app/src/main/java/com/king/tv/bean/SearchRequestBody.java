package com.king.tv.bean;

/**
 * @author yangbo
 * @since 2017/9/29
 * @mail 903023560@qq.com
 */

public class SearchRequestBody {

    private String v = "3.0.1";

    private String os = "1";

    private String ver = "4";

    private P p;

    public static SearchRequestBody getInstance(P p){
        return new SearchRequestBody(p);
    }

    public SearchRequestBody() {

    }

    public SearchRequestBody(P p) {
        this.p = p;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}
