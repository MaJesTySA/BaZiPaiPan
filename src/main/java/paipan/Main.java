package paipan;

import paipan.constants.Constants;
import paipan.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils.getSolarTermsMap();
        System.out.println(Constants.SOLAR_TERMS_MAP.get("2020"));

    }
}
