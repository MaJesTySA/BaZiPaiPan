package paipan.enums;

public enum DiZhi {
    ZI("子", 0),
    CHOU("丑", 1),
    YIN("寅", 2),
    MAO("卯", 3),
    CHEN("辰", 4),
    SI("巳", 5),
    WU("戊", 6),
    WEI("未", 7),
    SHEN("申", 8),
    YOU("酉", 9),
    XU("戌", 10),
    HAI("亥", 11);

    DiZhi(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    private String name;
    private Integer index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
