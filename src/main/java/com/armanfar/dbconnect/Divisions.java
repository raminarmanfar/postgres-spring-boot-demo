package com.armanfar.dbconnect;

public enum Divisions {
    MISSING_VALUE(""),
    GBA("GBA"),
    GBF("GBF"),
    GBG("GBG"),
    GBI("GBI"),
    GBM("GBM"),
    GBP("GB P - Products & Development"),
    GBS("GBS"),
    GBL("GBL"),
    INNOVAS("innovas"),
    MINNOSPHERE("minnosphere"),
    MSG_SERVICES("msg services"),
    MSG_GILLARDON("msg gillardon"),
    MSG_GLOBAL("msg global"),
    MSG_INDUSTRY_ADVISORS("msg industry advisors"),
    MSG_TREORBIS("msg treorbis"),
    MSG_AT("msg.AT"),
    MSG_CH("msg.CH"),
    MSG_LIFE("msg.life"),
    PLAUT_AT("Plaut AT"),
    PLAUT_DE("Plaut DE"),
    XBI("XBI"),
    SDA_SE("SDA SE"),
    XQT("XQT"),
    MSG_NEXINSURE("msg nexinsure"),
    M3("m3"),
    DX("DX"),
    GBD("GBD"),
    GBO("GBO"),
    // hofmanma, 2019/05/17, Add the following divisions
    MSG_DAVID("msg.DAVID");


    private final String value;

    Divisions(String value) {
        this.value = value;
    }

    public static Divisions getDivisionEnumByString(String name) {
        if("Insurance".equals(name) || "GBP".equals(name)){
            return Divisions.GBP;
        }

        for (Divisions dv : Divisions.values()) {
            if (dv.value.equals(name)) {
                return dv;
            }
        }

        return Divisions.MISSING_VALUE;
    }

    public String getValue() { return this.value; }
}
