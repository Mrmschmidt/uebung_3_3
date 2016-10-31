package uebung_3_3;

public class BMIRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Alter = 23;
		double Gewicht = 71;
		double Groesse = 1.65;
		boolean Maennlich = false;
		double BMI = Gewicht / (Groesse * Groesse);
		System.out.println("BMI " + BMI);

		if (Maennlich) {
			if (((Alter > 65) && (((BMI >= 25) && (BMI <= 30))))
					^ (((Alter > 54) && (Alter < 65)) && (((BMI >= 24) && (BMI <= 29))))
					^ (((Alter > 44) && (Alter < 55)) && (((BMI >= 23) && (BMI <= 28))))
					^ (((Alter > 34) && (Alter < 45)) && (((BMI >= 22) && (BMI <= 27))))
					^ (((Alter > 24) && (Alter < 35)) && (((BMI >= 21) && (BMI <= 26))))
					^ ((Alter < 24) && (((BMI >= 20) && (BMI <= 25)))))

			{
				System.out.println("OK");
			}

			else {
				System.out.println("N.O.");
			}
		}
		if (((Alter > 65) && (((BMI >= 24) && (BMI <= 29))))
				^ (((Alter > 54) && (Alter < 65)) && (((BMI >= 23) && (BMI <= 28))))
				^ (((Alter > 44) && (Alter < 55)) && (((BMI >= 22) && (BMI <= 27))))
				^ (((Alter > 34) && (Alter < 45)) && (((BMI >= 21) && (BMI <= 26))))
				^ (((Alter > 24) && (Alter < 35)) && (((BMI >= 20) && (BMI <= 25))))
				^ ((Alter < 24) && (((BMI >= 19) && (BMI <= 24)))))

		{
			System.out.println("OK");
		}

		else {
			System.out.println("N.O.");
		}

	}
}
