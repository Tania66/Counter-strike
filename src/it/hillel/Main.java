package it.hillel;

public class Main {

    public static void main(String[] args) {

        String teamName1 = "Lion";
	int simple = 107;
	int virgo = 253;
	int death = 106;
	int cloud = 199;
	int badB = 130;

	    String teamName2 = "Diablo";
	int devil = 105;
	int taurus = 125;
	int sonne = 333;
	int ragnar = 129;
	int nightmare = 109;

        double result1 = simple + virgo + death + cloud + badB / 5;

	    double result2 = devil + taurus + sonne + ragnar + nightmare / 5;

	    if(result1>result2) {

            System.out.println("Перемогла команда " + teamName1 + " набрала " + result1 );
        }else if(result2>result1){
			System.out.println(" Перемогла команда " + teamName2 + " набрала " + result2);
		}
    }
}




























