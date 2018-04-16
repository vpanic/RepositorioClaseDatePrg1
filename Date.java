import java.util.Random;

public class Date {
	
	private int day;
	
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public Date (int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	

	public Date(Date fecha) {
		this.day=fecha.day;
		this.month=fecha.month;
		this.year=fecha.year;
	}

	public boolean isSameDay(int oneDay){
		if(day==oneDay){
			return true;
		}
		return false;
	}

	public boolean isSameYear(int oneYear){
		if(year==oneYear){
			return true;
		}
		return false;
	}

	public boolean isSameMonth(int oneMonth){
		if(month==oneMonth)
			return true;
		
		return false;
	}

	public boolean isSame(Date fecha){
		if(day==fecha.day && month==fecha.month && year==fecha.year){
			return true;
		}else{
			return false;
		}
		
	}
	
	public String printsMonth(int month){
		String mes = "";
		switch (month) {
		case 1:mes="Enero";break;
		case 2:mes="Febrero";break;
		case 3:mes="Marzo";break;
		case 4:mes="Abril";break;
		case 5:mes="Mayo";break;
		case 6:mes="Junio";break;
		case 7:mes="Julio";break;
		case 8:mes="Agosto";break;
		case 9:mes="Septiembre";break;
		case 10:mes="Octubre";break;
		case 11:mes="Noviembre";break;
		case 12:mes="Diciembre";break;
		default:System.out.println("Introduce un mes de entre el 1 y el 12");break;
		}
		return mes;
	
	}
	public int dayToMonthEnd(Date fecha){
		int num=0;
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12){
			num=31-fecha.day;
		} else if (month==4 || month==6|| month==9 || month==11){
			num=30-fecha.day;
		}else{
			num=29-fecha.day;
		}
		return num;
	}
	public int daySinceFirstDayOfYear(Date fecha){
		int days=0;
		switch (fecha.month) {
		case 1: days=0;break;
		case 2: days=31;break;
		case 3: days=59;break;
		case 4: days=90;break;
		case 5: days=120;break;
		case 6: days=151;break;
		case 7: days=181;break;
		case 8: days=212;break;
		case 9: days=243;break;
		case 10: days=273;break;
		case 11: days=304;break;
		case 12: days=334;break;
		}

		days+=fecha.day;
		System.out.println("Days since first day:"+days);
		return days;
	}
	
	public void intentsHitDateDoWhile () {
		int intentos=0;
		Random randomNumber= new Random();
		randomNumber.setSeed(System.currentTimeMillis());
		Date fechaAleatoria = null;
		do{
			int diaAleatorio=randomNumber.nextInt(31)+1;
			int mesAleatorio=randomNumber.nextInt(12)+1;
			if(correctDate(diaAleatorio,mesAleatorio,year)){
				fechaAleatoria = new Date (diaAleatorio,mesAleatorio,year);
				intentos++;
			}
		} while(!isSame(fechaAleatoria));
		System.out.println("Number Of Intents: "+ intentos);
		
	}
	
	public int intentsHitDateWhile () {
		int intentos=0;
		Random randomNumber= new Random();
		randomNumber.setSeed(System.currentTimeMillis());
		Date fechaAleatoria = new Date(1,1,5000);
		while(!isSame(fechaAleatoria)){
			int diaAleatorio=randomNumber.nextInt(31)+1;
			int mesAleatorio=randomNumber.nextInt(12)+1;
			if(correctDate(diaAleatorio,mesAleatorio,year)){
				fechaAleatoria = new Date (diaAleatorio,mesAleatorio,year);
				intentos++;
			}
		}
		return intentos;
		
		
	}

	
	public int remainingMonths (Date fecha){
		int transcurridos = 0, restantes=0;
		
			transcurridos+=fecha.month-1;
			restantes=12-transcurridos;
			return restantes;
			
	}
	public String toString (Date fecha){
		return "Day:"+fecha.day+" Month:"+fecha.month+" Year:"+fecha.year;
	}
	
	public int daysOfMonth (int month){
		int dias=0;
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12){
			dias=31;
		} else if (month==4 || month==6|| month==9 || month==11){
			dias=30;
		}else{
			dias=29;
		}
		return dias;
	}
	
	public boolean correctDate (int dia,int mes,int year){
		if(dia<0 || dia>31 || year<0 || mes<0 || mes>12){
			return true;
		}
		if((dia<=31) && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10|| mes==12 )){
			return true;
		}
		else if((dia<=30) && (mes==4 || mes==6|| mes==9 || mes==11)){
			return true;
		}
		else if(dia<29 && mes==2)
			return true;
		else 
			return false;
		
		
	}
	public String getSeason (int unMes){
		String season="";
		if(unMes==11 || unMes==12 || unMes==1 || unMes==2){
			season="Winter";
		}else if(unMes==3 || unMes==4 || unMes==5){
			season="Spring";
		}else if(unMes==6 || unMes==7 || unMes==8 ){
			season="Summer";
		}else {
			season="Autumn";
		}
		return season;
		
	}
	public String knowDayIs (Date fecha, int diaSemana){
		String dias[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int diasTranscurridos=daySinceFirstDayOfYear(fecha);
		int resto=diasTranscurridos%7;
		int diaBuscado=(diaSemana+resto)%7;
		String diaFin=dias[diaBuscado];
		return diaFin;
		
	}
	
	public String passToString (int mes){
		String mesString;
		switch(mes){
		case 1: mesString="Enero"; break;
		case 2: mesString="Febrero"; break;
		case 3: mesString="Marzo"; break;
		case 4: mesString="Abril"; break;
		case 5: mesString="Mayo"; break;
		case 6: mesString="Junio"; break;
		case 7: mesString="Julio"; break;
		case 8: mesString="Agosto"; break;
		case 9: mesString="Semptiembre"; break;
		case 10: mesString="Octubre"; break;
		case 11: mesString="Noviembre"; break;
		case 12: mesString="Diciembre"; break;
		
		default: mesString =""; break;
		}
		return mesString;
		
		}
	
	
}

