
public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setHarclık(100);
        student.setAd("ece");
        student.setSoyad("deniz");
        student.setYas(20);
        
        System.out.println(student.getAd()+" "+student.getSoyad()+" "+student.getYas()+" "+student.getHarclık());
        
        Instructor instructor =new Instructor();
        instructor.setMaas(10000);
        instructor.setAd("engin");
        instructor.setSoyad("demirog");
        instructor.setYas(30);
        
        System.out.println(instructor.getAd()+" "+instructor.getSoyad()+" "+instructor.getYas()+" "+instructor.getMaas());
        
        /*User user=new User();
        user.setAd("ali");
        user.setSoyad("yilmaz");
        user.setYas(10);
        System.out.println(user.getAd()+user.getSoyad()+user.getYas());*/
        
        UserManager userManager=new UserManager();
        userManager.add(instructor);
        userManager.add(student);
	}

}
