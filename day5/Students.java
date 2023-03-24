package week5.day5;

public class Students {
	public void getStudentInfo(int getStudId) {
		System.out.println(getStudId);	
	}
    public void getStudentInfo(String getStudName,int getStudId) {
    	System.out.println(getStudName);
    	System.out.println(getStudId);
	}
    public void getStudentInfo(String getStudEmail) {
    	System.out.println(getStudEmail);
    }
    public void getStudentInfo(long getStudMob,String getStudEmail) {
    	System.out.println(getStudMob);
    	System.out.println(getStudEmail);
    }
    public static void main(String[] args) {
    	Students studInfo=new Students();
    	studInfo.getStudentInfo(25648);
    	studInfo.getStudentInfo("kabilraja@gmail.com");
    	studInfo.getStudentInfo(85214891324l, "kabilraja@gmail.com");
    	studInfo.getStudentInfo("Kabilan", 25648);
	}

}
