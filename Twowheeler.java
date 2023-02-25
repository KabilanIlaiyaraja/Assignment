package week1.day2;

public class Twowheeler {

int noOfWheels=2;
short noOFMirrors=2;
long chassisNumber=78549328756526l;
boolean isPunctured=true;
String bikeName="YamahaRX100";
double runningKM=22348.57;

public static void main(String[] args) {
	
	Twowheeler myBike =new Twowheeler();
	System.out.println(myBike.bikeName);
	System.out.println("chassisNumber=" +myBike.chassisNumber);
	System.out.println("isPunctured=" +myBike.isPunctured);
	System.out.println("runningKM="+myBike.runningKM);
	System.out.println("noOfwheels="+myBike.noOfWheels);
	System.out.println("noOfMirrors="+myBike.noOFMirrors);
	
	
}

	
}
