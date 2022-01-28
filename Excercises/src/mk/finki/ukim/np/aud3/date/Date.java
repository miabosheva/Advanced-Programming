package mk.finki.ukim.np.aud3.date;

public class Date {
    private static final int FIRST_YEAR = 1800;
    private static final int LAST_YEAR = 2500;
    private static final int DAYS_IN_YEAR = 365;

    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static final int[] daysTillFirstOfMonth;
    private static final int[] daysTillFirstOfJan1;

    static {
        daysTillFirstOfMonth = new int[12];
        for (int i = 1; i < 12; i++) {
            daysTillFirstOfMonth[i] += daysTillFirstOfMonth[i - 1] + daysInMonth[i - 1];
        }
        int total_years = LAST_YEAR - FIRST_YEAR + 1;
        daysTillFirstOfJan1 = new int[total_years];
        int current_year = FIRST_YEAR;
        for (int i = 1; i < total_years; i++) {
            if (isLeapYear(current_year)) {
                daysTillFirstOfJan1[i] = daysTillFirstOfJan1[i - 1] + DAYS_IN_YEAR + 1;
            } else {
                daysTillFirstOfJan1[i] = daysTillFirstOfJan1[i - 1] + DAYS_IN_YEAR;
            }
            current_year++;
        }
    }

    public static boolean isLeapYear(int curr) {
        return (curr % 400 == 0 || (curr % 100 != 0 & curr % 4 == 0));
    }

    private final int days;

    public Date(int days) {
        this.days = days;
    }

    public Date(int d, int m, int y) {
        int days = 0;
        if (y < FIRST_YEAR || y > LAST_YEAR) {
            throw new RuntimeException();
        }
        days += daysTillFirstOfJan1[y - FIRST_YEAR];
        days += daysTillFirstOfMonth[m - 1];
        if (m > 2 && isLeapYear(y)) {
            days++;
        }
        days += d;
        this.days = days;
    }

    public Date subtract(Date date){
        return new Date(this.days - date.days);
    }

    public Date increment(int days){
        return new Date(this.days+days);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int compareTo(Date date){
        return this.days - date.days;
    }

    @Override
    public String toString() {
        int d = days;
        int i;
        for(i=0; i<daysTillFirstOfJan1.length;i++){
            if(days<=daysTillFirstOfJan1[i]){
                break;
            }
        }
        d -= daysTillFirstOfJan1[i-1];
        int year = FIRST_YEAR + i - 1;
        if(isLeapYear(year)){
            d--;
        }
        for(i=0;i<daysTillFirstOfMonth.length;i++){
            if(d<=daysTillFirstOfMonth[i]){
                break;
            }
        }
        d-=daysTillFirstOfMonth[i-1];
        int month = i;

        return String.format("%02d:%02d:%4d",d, month, year);
    }

    public static void main(String[] args) {
        Date sample = new Date(1, 10, 2012);
        System.out.println(1);
        System.out.println(sample.subtract(new Date(1, 1, 2000)));

        System.out.println(2);
        System.out.println(sample);

        sample = new Date(1, 1, 1800);
        System.out.println(sample);

        sample = new Date(31, 12, 2500);
        System.out.println(daysTillFirstOfJan1[daysTillFirstOfJan1.length - 1]);
        System.out.println(sample.days);
        System.out.println(sample);

        sample = new Date(30, 11, 2012);
        System.out.println(sample);

        sample = sample.increment(100);
        System.out.println(sample);
    }
}
