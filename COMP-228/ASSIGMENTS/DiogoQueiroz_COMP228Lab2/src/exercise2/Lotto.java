package exercise2;

import java.security.SecureRandom;

public class Lotto {
    private int[] LottoValues = new int[3];

    Lotto () {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 3; i++) {
            this.LottoValues[i] = random.nextInt(9)+1;
        }
    }

    public int[] getLottoValues() {
        return LottoValues;
    }

    public int getTotalSumOfLottoValues() {
        int total = 0;
        for (int lottoValue : this.LottoValues) {
            total += lottoValue;
        }
        return total;
    }
}
