public class Kata {
    public static String add(String a, String b) {

        StringBuilder result = new StringBuilder();

        int pointerA = a.length() - 1;
        int pointerB = b.length() - 1;
        int carryValue = 0;

        for (int i = 0; i <= Math.max(pointerA, pointerB); i++){

            int aDigit = 0;
            int bDigit = 0;

            try{ aDigit = Integer.parseInt(String.valueOf(a.charAt(pointerA - i)));
            } catch(Exception ignored){} //Try turn the right most letter of the string to an integer

            try { bDigit = Integer.parseInt(String.valueOf(b.charAt(pointerB - i)));
            } catch(Exception ignored){} //Try turn the right most letter of the string to an integer


            int sum = aDigit + bDigit; //Add the digits together


            if(carryValue > 0){ //add and reset carry value
                sum += carryValue;
                carryValue = 0;
            }

            while(sum > 9){ //While the sum is greater than 10, -10 from sum and +1 carryValue
                carryValue++;
                sum -= 10;
            }

            if(i == Math.max(pointerA, pointerB) && sum < 1){
                break;
            }
            result.append(sum);
        }

        if (carryValue > 0){ //Add the remaining carryValue
            result.append(carryValue);
        }

        return result.reverse().toString();
    }

}