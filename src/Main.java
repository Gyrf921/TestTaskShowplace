import java.util.*;

public class Main {

    public static void main(String[] args) {
        double totalTime = 48 - 16; // Начальное время - сон

        getBestWay(totalTime, createShowplaces())
                .forEach(System.out::println);

    }

    public static List<Showplace> getBestWay(Double totalTime, List<Showplace> showplaces) {
        List<Showplace> selectedShowplaces = new ArrayList<>();

        showplaces.sort(Comparator.comparingDouble(Showplace::valuePerTime).reversed());

        for (Showplace showplace : showplaces) {
            if (showplace.getTime() <= totalTime) {
                selectedShowplaces.add(showplace);
                totalTime -= showplace.getTime();
            }
        }
        return selectedShowplaces;
    }

    public static List<Showplace> createShowplaces() {
        return new ArrayList<>(Arrays.asList(
                new Showplace("Исаакиевский собор", 5.0, 10),
                new Showplace("Эрмитаж", 8.0, 11),
                new Showplace("Кунсткамера", 3.5, 4),
                new Showplace("Петропавловская крепость", 10.0, 7),
                new Showplace("Ленинградский зоопарк", 9.0, 15),
                new Showplace("Медный всадник", 1.0, 17),
                new Showplace("Казанский собор", 4.0, 3),
                new Showplace("Спас на Крови", 2.0, 9),
                new Showplace("Зимний дворец Петра I", 7.0, 12),
                new Showplace("Зоологический музей", 5.5, 6),
                new Showplace("Музей обороны и блокады Ленинграда", 2.0, 19),
                new Showplace("Русский музей", 5.0, 8),
                new Showplace("Навестить друзей", 12.0, 20),
                new Showplace("Музей восковых фигур", 2.0, 13),
                new Showplace("Литературно-мемориальный музей Ф.М. Достоевского", 4.0, 2),
                new Showplace("Екатерининский дворец", 1.5, 5),
                new Showplace("Петербургский музей кукол", 1.0, 14),
                new Showplace("Музей микроминиатюры «Русский Левша»", 3.0, 18),
                new Showplace("Всероссийский музей А.С. Пушкина и филиалы", 6.0, 1),
                new Showplace("Музей современного искусства Эрарта", 7.0, 16)
        ));
    }

}