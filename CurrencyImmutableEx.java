public class CurrencyImmutableEx {

    public static void main(String[] args) {
        Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
        //Și dacă pentru tomorrowsCurrency ar trebui să modificați și coeficientul în 18.00f - cum ar arăta în cod?
        
        Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02").setValue(18.00f);
        
        //Câte obiecte Monedă au fost create ?

        // Au fost create 2 obiecte tip Moneda. todaysCurrency && tomorrowsCurrency


        System.out.println(todaysCurrency);
        System.out.println(tomorrowsCurrency);
        

    }

    
}

final class Currency {
    private String baseCode;
    private String code;
    private Float value;
    private String date;


    public Currency(String baseCode, String code, Float value, String date) {
        this.baseCode = baseCode;
        this.code = code;
        this.value = value;
        this.date = date;
    }


    public String getBaseCode() {
        return baseCode;
    }


    public String getCode() {
        return code;
    }


    public Float getValue() {
        return value;
    }


    public String getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Currency [baseCode=" + baseCode + ", code=" + code + ", value=" + value + ", date=" + date + "]";
    }

    public Currency setBaseCode(String baseCode) {
        return new Currency(baseCode, this.code, this.value, this.date);
    }

    public Currency setCode(String code) {
        return new Currency(this.baseCode, code, this.value, this.date);
    }

    public Currency setValue(Float value) {
        return new Currency(this.baseCode, this.code, value, this.date);
    }

    public Currency setDate(String date) {
        return new Currency(this.baseCode, this.code, this.value, date);
    }

    

    

    
}