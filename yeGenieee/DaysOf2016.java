public class DayOf2016 {
    public String solution(int a, int b) {
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] daysOfMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        int dates = 0;

        for (int i=0; i<a-1; i++) {
            dates += daysOfMonth[i];
        }
        dates += b;

        return day[dates % 7];
    }
}
