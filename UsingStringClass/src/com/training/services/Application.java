package com.training.services;

public class Application {

	public static void main(String[] args) {
		
		StringService service = new StringService();
		String city="chennai";
		System.out.println( (String.format("%S",city)));
		System.out.println(String.format(" %2$.3f %1$.2f  %3$.4f", 45.677,55.678,65.544));
		
		
		int key =6;
		
		switch (key) {
		case 1:
			service.stringEquals("ram","ram");
			break;
		case 2:
				service.stringObjectEquals();
				break;
		case 3:
			service.usingTrim("     ramesh  ");
			break;
		case 4:
				service.lenghOfString(" ram  ");
			 break;
		case 5:
			   service.usingSubString("ramesh");
			   break;
		case 6:
			 service.usingCharAtAndOfIndex("ram@abc.com");
		  	break;
		  case 7:
		  		service.usingReplace("bhuvi@avb.com", "welcome to bank");
		   		break;
		case 8:
				  
			service.usingConcat("bhuvanesh", "wari");
		    break;
		case 9:
			service.usingCompareTo("bhuvi", "bhuvi");
			break;
		case 10:
			service.usingStringFormat("ram",95.0344);
			break;
		case 11:
		    service.usingStringFormat(17);
		    break;
		 case 12:
			 service.usingStringFormat(16,16);
             break;
         case 13:
        	 service.usingStringFormat("bhuvi","bhu");
        	 break;
        case 14:
        	service.usingStringFormat(-421L);
        	break;
             default:
            	 
			break;
		}
		// TODO Auto-generated method stub

	}

}
