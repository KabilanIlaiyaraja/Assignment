package week1.day2;

public class Mobile {

String mobileBrandName="Micromax";
char logo='M';
short noOfMobilePiece= 3520;
int modelNumber=60606060;
long mobileImeiNumber=5642654132542398l;
float mobilePrice=24499.99f;
boolean isDamaged=false;

public static void main(String[] args) {
	
	Mobile myNewMobile=new Mobile();
	
	System.out.println(myNewMobile.mobileBrandName);
	System.out.println("logo="+ myNewMobile.logo);
	System.out.println("noOfMobilePieces="+myNewMobile.noOfMobilePiece);
	System.out.println("modelNumber="+myNewMobile.modelNumber);
	System.out.println("ImeiNumber="+myNewMobile.mobileImeiNumber);
	System.out.println("Price="+myNewMobile.mobilePrice);
	System.out.println("isDamaged="+myNewMobile.isDamaged);
	
}


}
