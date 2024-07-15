public class EvenDays {
    public static void main(String[] args) {
        int august = 31;
        int daysAllowed = 0;

        for (int i =1 ; i<=31;i++){
            if (i%2==0)
                daysAllowed++;
        }

        System.out.print("number of allowed days are : " + daysAllowed);
    }
}
