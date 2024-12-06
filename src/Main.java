import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4;
        int[] distributeCandies = new int[num_people]; // Şeker dağıtımı için dizi
        int currentCandy = 1; // Verilecek sıradaki şeker miktarı
        int index = 0; // Şeker vereceğimiz kişinin indeksi
        while (candies>0){
            if(candies<currentCandy){
                distributeCandies[index]+=candies;
                break;
            }
            candies-=currentCandy;
            distributeCandies[index] += currentCandy;
            currentCandy++;

            index = (index+1)%num_people;
        }
        System.out.println(Arrays.toString(distributeCandies));
    }
}
