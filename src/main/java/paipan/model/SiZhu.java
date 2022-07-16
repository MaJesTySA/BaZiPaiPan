package paipan.model;

import paipan.enums.DiZhi;
import paipan.enums.TianGan;

public class SiZhu {
    private TianGan tianGan;
    private DiZhi diZhi;

    public SiZhu(TianGan tianGan, DiZhi diZhi) {
        this.tianGan = tianGan;
        this.diZhi = diZhi;
    }

    public TianGan getTianGan() {
        return tianGan;
    }

    public void setTianGan(TianGan tianGan) {
        this.tianGan = tianGan;
    }

    public DiZhi getDiZhi() {
        return diZhi;
    }

    public void setDiZhi(DiZhi diZhi) {
        this.diZhi = diZhi;
    }

    @Override
    public String toString() {
        return tianGan.getName() + diZhi.getName();
    }
}
