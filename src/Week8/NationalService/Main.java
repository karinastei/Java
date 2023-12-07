package Week8.NationalService;

public class Main {
    public static void main(String[] args) {
        CivilService civilService = new CivilService();
        MilitaryService militaryService = new MilitaryService(300);

        System.out.println("Initial days left for Civil Service: " + civilService.getDaysLeft());
        System.out.println("Initial days left for Military Service: " + militaryService.getDaysLeft());

        civilService.work();
        militaryService.work();

        System.out.println("Days left for Civil Service after work: " + civilService.getDaysLeft());
        System.out.println("Days left for Military Service after work: " + militaryService.getDaysLeft());
    }
}
