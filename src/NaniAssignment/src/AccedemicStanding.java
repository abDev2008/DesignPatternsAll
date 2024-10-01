package NaniAssignment.src;

public enum AccedemicStanding {
    FRESHMAN(30), SOPHOMORE(60), JUNIOR(90), SENIOR(120);
    private int creditHours;

    AccedemicStanding(int creditHours) {
        this.creditHours = creditHours;
    }
    public AccedemicStanding getAccademicStanding(int creditHours) {
        if (creditHours <= FRESHMAN.creditHours)
            return FRESHMAN;
        else if (creditHours <= SOPHOMORE.creditHours) {
            return SOPHOMORE;
        } else if (creditHours <= JUNIOR.creditHours) {
            return JUNIOR;
        } else return SENIOR;
    }

}