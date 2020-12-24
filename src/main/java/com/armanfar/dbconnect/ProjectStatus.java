package com.armanfar.dbconnect;

public enum ProjectStatus {

    MISSING_VALUE(""),
    ACTIVE("Aktiv"),
    OFFER("Angebot"),
    REJECTED("Abgelehnt"),
    COMPLETED("Abgeschlossen"),
    WARRANTY("Gewährleistung"),
    NOT_RELEVANT("Nicht relevant");

    private final String value;

    ProjectStatus(String value) {
        this.value = value;
    }

    public static ProjectStatus getEnumByString(String value) {
        for (ProjectStatus ps : ProjectStatus.values()) {
            if (ps.value.equals(value)) {
                return ps;
            }
        }
        return ProjectStatus.MISSING_VALUE;
    }

    public String getValue(){
        return this.value;
    }
}

