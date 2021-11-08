package utils;

public class Dictionary {

    public static boolean isEnglishWord(String word){
        String dict[] = {"king","kin","gkin"} ;
        for (String str:dict) {
            if(str.equals(word)){
                return true;
            }
        }
        return false;


    }
}
