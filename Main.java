public class Main {
    static public void main(String args[]){
        Day date = new Day(2000, 1, 1);

        System.out.println(date.daysFrom(new Day(2023, 2, 8)));
        System.out.println(date.daysFrom(new Day(1999, 12, 31)));

        Day other = date.plusDays(1000);
        System.out.println(other.getYear());
        System.out.println(other.getMonthValue());
        System.out.println(other.getDayOfMonth());
    }
}
