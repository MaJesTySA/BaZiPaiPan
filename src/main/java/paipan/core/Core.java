package paipan.core;

import paipan.constants.Constants;
import paipan.enums.DiZhi;
import paipan.enums.TianGan;
import paipan.model.SiZhu;

import static paipan.constants.Constants.BASE_DIZHI_CIRCLE;
import static paipan.constants.Constants.BASE_TIANGAN_CIRCLE;

public class Core {

    public static SiZhu getNianZhu(int year) {
        int diffYear = year - Constants.BASE_YEAR;
        int tianGanDiff = diffYear % BASE_TIANGAN_CIRCLE;
        int diZhiDiff = diffYear % BASE_DIZHI_CIRCLE;
        TianGan nianGan;
        DiZhi nianZhi;
        if (tianGanDiff > 0) {
            nianGan = TianGan.getFromIndex(tianGanDiff + 1);
        } else if (tianGanDiff == 0) {
            nianGan = Constants.BASE_NIANGAN;
        } else {
            nianGan = TianGan.getFromIndex(BASE_TIANGAN_CIRCLE - Math.abs(tianGanDiff) + 1);
        }
        if (diZhiDiff > 0) {
            nianZhi = DiZhi.getFromIndex(diZhiDiff + 1);
        } else if (diZhiDiff == 0) {
            nianZhi = Constants.BASE_DIZHI;
        } else {
            nianZhi = DiZhi.getFromIndex(BASE_DIZHI_CIRCLE - Math.abs(diZhiDiff) + 1);
        }
        return new SiZhu(nianGan, nianZhi);
    }

    public static void main(String[] args) {
        for (int i = 1900; i < 2031; i++) {
            System.out.println(i + " : " + getNianZhu(i));
        }
    }
}
