package Menu;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        launch();
    }
    static Scanner scanner = new Scanner(System.in);

    private static void launch(){

        do {
            menu();
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    optionUser();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        } while (true);
    }
    private static void optionUser(){
        do {
            menuUser();
            int asd = Integer.parseInt(scanner.nextLine());
            switch (asd){
                case 1:
                    addUser();
                    break;
            }
        } while (true);
    }
    private static void launch3(){
        do {
            addUser();
            int abc = Integer.parseInt(scanner.nextLine());
            switch (abc){
                case 1:
                    System.out.println("Them User thanh cong");
                    break;
                case 2:
                    break;
            }
        } while (true);
    }

    private static void menu(){
        System.out.println("\t//////////////// MENU ///////////");
        System.out.println("\t/                                /");
        System.out.println("\t/        1,quan ly nguoi dung    /");
        System.out.println("\t/        2,quan ly ao quan       /");
        System.out.println("\t/        3,quan ly hang ton kho  /");
        System.out.println("\t/        5,quay lai              /");
        System.out.println("\t/                                /");
        System.out.println("\t//////////////////////////////////");
    }
    private static void menuUser(){
        System.out.println("* * * * * * * * * Chuc nang * * * *    ");
        System.out.println("*                                     *");
        System.out.println("*         1,them nguoi dung           *");
        System.out.println("*         2,them thong tin nguoi dung *");
        System.out.println("*         3,quan ly don dat hang      *");
        System.out.println("*         4,quay laij                 *");
        System.out.println("*                                     *");
        System.out.println("*  * * * * * * * * * * * * * * * * * * ");
    }
    private static void addUser(){
        System.out.println("??? ??? ??? ??? ??? ???th??m ng?????i d??ng ??? ??? ??? ??? ???");
        System.out.println("???                                             ???");
        System.out.println("???        a,th??m b???ng ?????a ch??? id               ???");
        System.out.println("???        b,th??m s??? ??i???n tho???i                 ???");
        System.out.println("???        c,th??m ?????a ch??? ng?????i d??ng            ???");
        System.out.println("???        d,quay l???i                           ???");
        System.out.println("?????? ??? ??? ??? ??? ??? ??? ??? ??? ??? ??? ??? ??? ??? ???");

    }
}
