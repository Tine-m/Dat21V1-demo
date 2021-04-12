package exercise;

public class WhatsUp {

    public boolean isWorkDay(Day day) {
        if (day.equals(Day.SATURDAY) || day.equals(Day.SUNDAY)) {
            return false;
        }
        else return true;
    }

    public boolean findId(int[] ids, int id) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id) {
                return true;
            }
        }

        return false;
    }
}
