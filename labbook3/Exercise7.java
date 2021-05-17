package labbook3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
public class Exercise7 {

	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
		Date d1=sdf.parse(sc.nextLine());
		Date s=new Date();
		String s1=sdf.format(s);
		Date d2=sdf.parse(s1);
		sdf.setLenient(false);
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        LocalDate t1=LocalDate.of(c1.get(Calendar.YEAR),c1.get(Calendar.MONTH)+1,c1.get(Calendar.DATE));
        LocalDate t2=LocalDate.of(c2.get(Calendar.YEAR),c2.get(Calendar.MONTH)+1,c2.get(Calendar.DATE));
        Period diff=Period.between(t1,t2);
        System.out.println("Years diff: "+diff.getYears());
       System.out.println("Months diff: "+diff.getMonths());
      System.out.println("Days diff: "+diff.getDays());
      sc.close();
       
	}

}
