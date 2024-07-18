public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 0 || second < 0){
            return -1;
        }
        int divisor= 0;
        int maxNumber = 0;

        if(first > second){ //find what number is the greatest
            maxNumber = first;
        }else {
            maxNumber= second;
        }

        for(int i = 1; i < maxNumber; i++){
            if (first % i == 0 && second % i == 0) { // find the common divisor
                    if(divisor < i){
                        divisor = i; // find the greatest common divisor
                    }
            }
        }
        return divisor;
    }
}
