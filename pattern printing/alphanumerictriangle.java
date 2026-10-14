public class alphanumerictriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {

                if(i==1){System.out.print(j+" ");}
                else if(i==2){System.out.print((char)(64+j)+" ");}
                else if(i==3){System.out.print(j+" ");}
                else{System.out.print((char)(j+64)+" ");}
            }

            System.out.println();

        }

    }
}
