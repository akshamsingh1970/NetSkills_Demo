
class student {
    public static void main(String[] args) {
        int per = 90;
        if(per>80){
            System.out.println("Students division is Dictation");
        }
        else if(per>=60 && per<=80)
		{			
			System.out.println("Students division is First Division.");
		}
		else if(per>=50 && per<=59)
		{			
			System.out.println("Students division is Second Division.");
		}
		else if(per>=40 && per<=49)
		{			
			System.out.println("Students division is Third  Division.");
		}
		else
		{			
			System.out.println("Students division is Fail.");
		}
    }
}