public class App {
    public static void main(String[] args) {
        Holiday holiday = new Holiday();

        System.out.println(" ---- Testando a busca por feriado específico ---- \n");
        System.out.println(holiday.getDate("21/04/2023"));
        System.out.println(holiday.getDate("09/06/2023") + "\n");
        System.out.println(" ---- fim ---- \n");

        System.out.println("Buscando todos os feriados cadastrados \n");
        holiday.allHolidays();
    }
}
