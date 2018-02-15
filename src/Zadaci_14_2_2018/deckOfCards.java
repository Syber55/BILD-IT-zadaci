package Zadaci_14_2_2018;


public class deckOfCards {

	public static void main(String[] args) {
	int random1 = (int) (Math.random()*14) + 1;
	int random2 = (int) (Math.random()*4) + 1;
	String broj = "";
	String znak = "";
	switch(random1) {
	case 1 : broj = "A"; break;
	case 2 : broj = "2"; break;
	case 3 : broj = "3"; break;
	case 4 : broj = "4"; break;
	case 5 : broj = "5"; break;
	case 6 : broj = "6"; break;
	case 7 : broj = "7"; break;
	case 8 : broj = "8"; break;
	case 9 : broj = "9"; break;
	case 10 : broj = "10"; break;
	case 11 : broj = "A"; break;
	case 12 : broj = "J"; break;
	case 13 : broj = "Q"; break;
	case 14 : broj = "K"; break;
	}
	switch(random2) {
	case 1 : znak = "Srce"; break;
	case 2 : znak = "Pik"; break;
	case 3 : znak = "Djetelina"; break;
	case 4 : znak = "Kocka"; break;
	}
	System.out.println("Kartu koju ste izvukli je " + broj + " u znaku " + znak);
	}
}
