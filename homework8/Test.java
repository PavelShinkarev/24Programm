package homework8;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader) {
        double euro = loader.load(SiteLoader.Currency.EUR);
        double rub = loader.load(SiteLoader.Currency.RUB);
        double usd = loader.load(SiteLoader.Currency.USD);
        System.out.println(euro);
        System.out.println(rub);
        System.out.println(usd);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Курс EUR " + Double.toString(euro) + "\n");
        stringBuilder.append("Курс RUB " + Double.toString(rub) + "\n");
        stringBuilder.append("Курс USD " + Double.toString(usd) + "\n");
        SaveResult(stringBuilder.toString());
    }

    public static void SaveResult(String string) {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь, для сохранения файла: ");
        String way = null;
        try {
            way = scanner.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File(way);
        if (file.isDirectory()) {
            String filePath = way + File.separator + "RatesFromBuffer.txt";
            BufferWr(filePath, string);
        } else if (!file.isDirectory()) {
            String filePather = "src" + File.separator + "RatesFromBuffer.txt";
            BufferWr(filePather, string);
        }

//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите путь, для сохранения файла: ");
//            String way = scanner.nextLine();
//            File file = new File(way);
//            if(file.isDirectory()){
//                String filePath = way + File.separator + "Rates.txt";
//                FileWr(filePath, string);
//            }else if(!file.isDirectory()){
//                String filePath = "src"+ File.separator + "Rates.txt";
//                FileWr(filePath, string);
//            }
//            scanner.close();

    }

    public static void BufferWr(String string, String str) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");// курсы валют должны быть сохранены в упорядоченными по дате
            Date date = new Date();
            BufferedWriter writer = new BufferedWriter(new FileWriter(string, true));
            writer.write(dateFormat.format(date) + "\n");
            writer.write(str + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

                             /*Через Scanner
                              */


//    public static void FileWr(String string, String str) {
//        try {
//            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//            Date date = new Date();
//            FileWriter writer = new FileWriter(string, true);
//            writer.write(dateFormat.format(date) + "\n");
//            writer.write(str + "\n");
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println("Упс, ошибка родной. Такое бывает ... ");
//        }
//    }
}