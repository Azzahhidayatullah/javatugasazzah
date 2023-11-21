import java.util.Scanner;
public class tugas3negara (
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
			System.out.print ("inputkan kode negara: "); 
			String namanegara = input.nextLine();
			
			String hasil;

		switch (namanegara) (
		case "ES":
			  hasil = "Spain");
			break;
			case "TN":
			     hasil = "TUNISIA";
			break;
			case "ID":
			     hasil = "Indonesia"; 
			break;
			case "MM":
			     hasil = "Myanmar"
			break;
			case "IN":
			     hasil = "India";
			break;
			default:
			System.out.println("Maaf, kode negara tidak diketahui");

                return;
	}
	
	System.out.println("nama negara : " + namanegara + "nama negaranya yaitu: " + hasil);
	}
}