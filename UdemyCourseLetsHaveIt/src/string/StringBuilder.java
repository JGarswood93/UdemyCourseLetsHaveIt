package string;

public class StringBuilder {

    public static void main(String[] args) {

        String myString = " ";

        for (char c = 'a'; c<= 'z'; c++) {
            myString += c;
        }
        System.out.println(myString);


        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c<= 'z'; c++) {


        }

        System.out.println(sb);
    }

}
