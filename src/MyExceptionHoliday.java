import java.util.Scanner;

public class MyExceptionHoliday {

    public static void main (String[] args){

        while(true){
        MyExceptionHoliday noHoliday = new MyExceptionHoliday();
        }

    }

    MyExceptionHoliday(){

        int[] date= new int[32];

        //1=休みor祝日 0=平日
        //date[0] = 1;
        date[1] = 0;
        date[2] = 0;
        date[3] = 1;
        date[4] = 1;
        date[5] = 1;
        date[6] = 1;
        date[7] = 0;
        date[8] = 0;
        date[9] = 0;
        date[10] = 0;
        date[11] = 1;
        date[12] = 1;
        date[13] = 0;
        date[14] = 0;
        date[15] = 0;
        date[16] = 0;
        date[17] = 0;
        date[18] = 0;
        date[19] = 0;
        date[20] = 0;
        date[21] = 0;
        date[22] = 0;
        date[23] = 0;
        date[24] = 0;
        date[25] = 1;
        date[26] = 1;
        date[27] = 0;
        date[28] = 0;
        date[29] = 0;
        date[30] = 0;
        date[31] = 0;

            try{

                System.out.println("5月の日付を入力して下さい");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                //System.out.println(number);

                test(date[number]);

                }catch (NoHolidayException e){
                e.printStackTrace();
                }
            }

	void test(int date) throws NoHolidayException{
		if(date == 0){
			throw new NoHolidayException();
		}else{
            System.out.println("その日は休日です");
        }
	}
}



