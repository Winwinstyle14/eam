package vhc.smartw.eam.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringTool {
    private static final String NUMBERS = "1234567890";
    private static final SimpleDateFormat dff = new SimpleDateFormat("yyyyMMddHHmm");

    public static String generateToken(int length) {
        String combinedChars = NUMBERS;
        Random random = new Random();
        char[] password = new char[length];

        for(int i = 0; i< length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return String.valueOf(password);
    }

    public static String generateWoName(){
        var token = generateToken(5);
        var timeNow = dff.format(new Date());

        return String.format("WO_UCTT_%s_%s", timeNow, token);
    }

    public static String generateRequestNumber(long transactionTypeId){
        var token = generateToken(5);
        var timeNow = dff.format(new Date());

        if(transactionTypeId == 9 || transactionTypeId == 10){
            return String.format("BD%s_%s", timeNow, token);
        }else{
            return String.format("DC%s_%s", timeNow, token);
        }
    }

    public static void main(String[] args){
        System.out.println(generateWoName());
    }
}
