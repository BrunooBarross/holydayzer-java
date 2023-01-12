import java.util.ArrayList;
import java.util.List;

public class Holiday {
    private List<String> holidayDates = new ArrayList<>();
    private List<String> holidayTitle = new ArrayList<>();

    public Holiday() {
        holidayDates.add("01/01/2023");
        holidayTitle.add("Confraternização mundial");
        holidayDates.add("21/02/2023");
        holidayTitle.add("Carnaval");
        holidayDates.add("17/04/2023");
        holidayTitle.add("Páscoa");
        holidayDates.add("21/04/2023");
        holidayTitle.add("Tiradentes");
        holidayDates.add("01/05/2023");
        holidayTitle.add("Dia do Trabalho");
        holidayDates.add("08/06/2023");
        holidayTitle.add("Corpus Christi");
        holidayDates.add("07/09/2023");
        holidayTitle.add("Independência do Brasil");
        holidayDates.add("12/10/2023");
        holidayTitle.add("Nossa Senhora Aparecida");
        holidayDates.add("02/11/2023");
        holidayTitle.add("Finados");
        holidayDates.add("15/11/2023");
        holidayTitle.add("Proclamação da República");
        holidayDates.add("25/12/2023");
        holidayTitle.add("Natal");
    }

    public String getDate(String date) {
        if (holidayDates.contains(date)) {
            return date + " => " + holidayTitle.get(holidayDates.indexOf(date));
        }

        return date + " => " + "Feriado não encontrado";
    }

    public void allHolidays() {
        for (int i = 0; i < holidayDates.size(); i++) {
            System.out.println(holidayDates.get(i) + " => " + holidayTitle.get(i));
        }
    }

}
