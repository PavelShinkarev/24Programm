package homework8;

import homework8.SiteLoader;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        String string = content.substring(content.indexOf("Rate\":")+6, content.indexOf("}"));
        Double doub = 0.0;
        try{
             doub = Double.parseDouble(string);
        }catch (NumberFormatException e){
            System.out.println("Иди и учи Java, лошара");
        }
        return doub;
    }
}

