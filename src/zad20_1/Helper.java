package zad20_1;

public class Helper {

    protected static int getInitialValue(String... params) {

        int positionOfNotNull = -1;
        for (int i = 0; i < params.length; i++) {
            if (!params[i].equals("")) {
                if (positionOfNotNull == -1) {
                    positionOfNotNull = i;
                }else{
                    return -1;
                }
            }
        }
        return positionOfNotNull;
    }

}
