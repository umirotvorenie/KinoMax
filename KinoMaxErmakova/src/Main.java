import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int size = 30;
        ArrayList<SeatInfo> seats = new ArrayList<>((size));
        for (int i = 0; i < size; i++) {
            int seatPrice = calculateSeatPrice(i + 1);
            seats.add(new SeatInfo(seatPrice, false, null));
        }
        while (true){
            System.out.println("Введите 1, чтобы посмотреть свободные места\nВведите 2, чтобы забронировать место\nВведите 3, чтобы посмотреть полученную прибыль");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    for(int i = 0; i < seats.size(); i++ ){
                        SeatInfo seatInfo = seats.get(i);
                        if(!seatInfo.getIsFree()){
                            System.out.println(( i +1 ) + " " + "Свободно" + " " + "Цена:" + " " + seatInfo.getPrice());
                        }
                        else{
                            System.out.println(( i +1 ) + " " + "Занято" + " " + seatInfo.getName());
                        }
                    }
                    break;

                case 2:
                    System.out.println("Введите номер места");
                    int i = sc.nextInt() - 1;
                    SeatInfo seatInfo = seats.get(i);
                    System.out.println("Введите ваше имя");
                    seatInfo.setName(sc.next());
                    if(seatInfo.getIsFree()){
                        System.out.println("Место уже забронировано");
                        break;
                    }
                    else{
                        System.out.println("Номер" + " " + (i + 1) + " " +  "успешно забронирован");
                        seatInfo.setIsFree(true);
                        result += seatInfo.getPrice();
                        break;
                    }
                case 3:
                        System.out.println("Прибыль:" + " " + result);
                    break;

            }


        }

    }
    private static int calculateSeatPrice(int seatNum) {
        int firstPrice = 1000;
        int discount = 100;
        return firstPrice - ((seatNum - 1) / 5) * discount;
    }
}