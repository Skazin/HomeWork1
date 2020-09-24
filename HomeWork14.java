package HomeWork1;

public class HomeWork14 {

    public static void main(String[] args) {


        for (boolean a = true; boolean b = true){
         if (sleepIn(a, b)) System.out.println("Пора на работу");
         else System.out.println("Спим дальше");}

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) return true;
        else return false;
    }

}