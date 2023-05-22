public class Gachamiguero {
    public static String cocinarGachamiga(int n){
        if(n%15==0) return "Gachamiga";
        if(n%3==0) return "Gacha";
        if(n%5==0) return "Miga";
        return n+"";
    }
}
