package HomeWork;

public class Base1 {
        public static void printJava() {
            String str1 = "Хорошо идут дела";
            String str2 = "Изучаю Java я!";
            String str3 = " ";

            System.out.println(str1);
            System.out.println(str2);
            System.out.print(str1);
            System.out.print(str3);
            System.out.println(str2);
            System.out.print(str2);
            System.out.print(str3);
            System.out.println(str1);
            //sktg
        }
        public static void printJava(String java1, String java2) {
            System.out.println(java1);
            System.out.print(java2);
            System.out.println("!");
            System.out.print(java1);
            System.out.print(", ");
            System.out.print(java2);
            System.out.println("!");
            System.out.print(java2);
            System.out.print(", ");
            System.out.print(java1);
            System.out.println("!");
        }
        public static String plusJava(String message) {
            String result = "Java - " + message + " язык программирования";
            System.out.println(result);
            return result;
        }


        public static void main(String [] args) {
            printJava();
            printJava("Буду, буду программистом ", "Код пишу я чисто, чисто");
            plusJava("самый популярный");

            String str = plusJava("самый популярный");
            System.out.println("str = " + str);

            str = plusJava("очень интересный");
            System.out.println("str = " + str);

            str = plusJava("объектно-ориентированный");
            System.out.println("str = " + str);

        }
}
