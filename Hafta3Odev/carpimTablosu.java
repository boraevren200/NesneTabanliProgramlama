package Hafta3Odev;

public class carpimTablosu {
    public static void main(String[] args) {
    int carp=1;
    for(int i =1;i<10; i++){
        for(int j = 1; j<10;j++){
            carp=i*j;
            System.out.print(i+"x"+j+"="+carp+"\t");
        }
        System.out.println();
    }
    }
}
