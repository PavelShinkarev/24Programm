package homework4;

public class TasksString {
    private static final String[] UNITS = {"\b","один","два","три","четыре","пять","шесть","семь","восемь",
            "девять","деcять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать",
            "семнадцать","восемнадцать","девятнадцать"};
    private static final String[] TEN = {"\b","десять","двадцать","тридать","сорок", "пятьдесят", "шестьдесят",
            "семьдесят", "восемьдесят", "девяноста"};
    private static final String[] HUND = {"\b","сто","двести","триста","четыристта", "пятьсот", "шестьсот",
            "семьсот", "восемьсот", "девятьсот"};
    private static final String[] THOUS = {"\b","одна тысяча","две тысячи", "тысячи","тысячи","тысяч","тысяч","тысяч",
            "тысяч","тысяч"};


    public static void main(String[] args) {
       String string = toString(87_358);
        System.out.println(string);
    }
    public static String toString(int mark){
        StringBuilder sb = new StringBuilder();
        if(mark<20){                            // единицы
            sb.append(UNITS[mark]);
        }else if(mark<100){                          // десятки
             int high = mark/10;
            int low = mark%10;
            sb.append(TEN[high]);
             sb.append(" " + UNITS[low]);
         }else if(mark<1000){                       // сотни
            int Hhigh = mark/100;
            sb.append(HUND[Hhigh]);
            int high = (mark%100)/10;

            if(high == 1){                           //
                int temp = mark % 100;              //        проверка на 1
                sb.append(" " + UNITS[temp]);

            }else {
                sb.append(" " + TEN[high]);
                int low = mark % 10;
                sb.append(" " + UNITS[low]);
            }
        }else if(mark<10_000){                      // тысячи
            int Thigh = mark/1000;
            if(Thigh>2 && Thigh<10) {
                sb.append(UNITS[ Thigh]);
            }
            if(Thigh ==1){
                sb.append(" "+THOUS[Thigh]);
            }
            if(Thigh==2 || Thigh==3 ||Thigh==4){
                sb.append(" "+THOUS[Thigh]);
            }
            if((Thigh==5 || Thigh==6 ||Thigh==7|| Thigh==8 ||Thigh==9)){
                sb.append(" "+THOUS[Thigh]);
            }
            int Hhigh = (mark%1000)/100;
                sb.append(" " + HUND[Hhigh]);
                int TNhigh = (mark % 100) / 10;

                if (TNhigh == 1) {                          // if  == 1
                    int temp = mark % 100;
                    sb.append(" " + UNITS[temp]);

                } else {
                    sb.append(" " + TEN[TNhigh]);
                    int UNhigh = mark % 10;
                    sb.append(" " + UNITS[UNhigh]);
                }
        }else if(mark<100_000){                     // десятки тысяч
            int HHigh = mark/10_000;
            if(HHigh == 1){
                int temp = mark / 1000;
                sb.append(UNITS[temp]+ " "+ THOUS[9]);
            }else{
                int LHigh = (mark % 10_000) / 1000;
                if (LHigh == 0) {
                    sb.append(TEN[HHigh] + " " + THOUS[9]);
                } else {
                    sb.append(" " + TEN[HHigh] + " " + UNITS[LHigh] + " " + THOUS[LHigh]);
                }
            }
            int High = (mark%1000)/100;
            sb.append(" "+HUND[High]);
            int HLow = (mark%100)/10;
            if(HLow == 1){
                int temp = mark % 100;
                sb.append(" "+UNITS[temp]);
            }else {
                sb.append(" " + TEN[HLow]);
                int Low = mark % 10;
                sb.append(" " + UNITS[Low]);
            }



        }else if(mark<1_000_000){                     // сотни тысяч
            int HHigh = mark/100_000;
            sb.append(HUND[HHigh]);
            int LHigh = (mark % 100_000) / 10_000;
            if(LHigh == 0){

                }
                sb.append(HUND[HHigh]);
            }



         return sb.toString();
    }
}
