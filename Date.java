import java.util.Random;

public class Date {
	
	private int day;
	private int month;
	private int year;


	public Date (int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
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
		if(day==fecha.day && month==fecha.month && year==fecha.month){
			return true;
		}
		return false;
	}
	
	public void printsDay(){
		switch (month) {
		case 1:System.out.println("Enero");break;
		case 2:System.out.println("Febrero");break;
		case 3:System.out.println("Marzo");break;
		case 4:System.out.println("Abril");break;
		case 5:System.out.println("Mayo");break;
		case 6:System.out.println("Junio");break;
		case 7:System.out.println("Julio");break;
		case 8:System.out.println("Agosto");break;
		case 9:System.out.println("Septiembre");break;
		case 10:System.out.println("Octubre");break;
		case 11:System.out.println("Noviembre");break;
		case 12:System.out.println("Diciembre");break;
		default:System.out.println("Introduce un mes de entre el 1 y el 12");break;
		}
	
	}
	public void dayToMonthEnd(Date fecha){
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12){
			System.out.println("Los dias restantes son:"+ (31-fecha.day));
		} else if (month==4 || month==6|| month==9 || month==11){
			System.out.println("Los dias que quedan son"+(30-fecha.day));
		}else{
			System.out.println("Los dias que quedan son"+(29-fecha.day));
		}
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
	
	public void intentosHitDateWhile () {
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
		System.out.println("Number of Intents "+intentos);
		
	}

	
	public void remainingMonths (Date fecha){
		int transcurridos = 0, restantes=0;
		
			transcurridos+=fecha.month-1;
			restantes=12-transcurridos;
			System.out.println("Month to final year:"+restantes);
			
	}
	public void printDate(Date fecha){
		System.out.println("Day:"+fecha.day+" Month:"+fecha.month+" Year:"+fecha.year);
	}
	
	public void theSameMesDay (int month){
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10|| month==12){
			System.out.println("Have the same days:January,March,May,July,August,October and December");
		} else if (month==4 || month==6|| month==9 || month==11){
			System.out.println("Have the same days: April,June,September,November");
		}else{
			System.out.println("February have 29 days");
		}
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
	public void season (int unMes){
	
		if(unMes==11 || unMes==12 || unMes==1 || unMes==2){
			System.out.println("Invierno");
		}else if(unMes==3 || unMes==4 || unMes==5){
			System.out.println("Primavera");
		}else if(unMes==6 || unMes==7 || unMes==8 ){
			System.out.println("Verano");
		}else {
			System.out.println("Otoño");
		}
		
	}
	public void saberDiaSemana (Date fecha, int diaSemana){
		String dias[]={"domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
		int diasTranscurridos=daySinceFirstDayOfYear(fecha);
		int resto=diasTranscurridos%7;
		int diaBuscado=(diaSemana+resto)%7;
		System.out.println("El dia de la semana de la fecha dicha es"+dias[diaBuscado]);
		
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