
public class CNumberDecorator implements IDecorator{

	

	@Override
	public String decorate(String str) {
//		String number = str;
//		for(int i=0;i<str.length();i++){
//			if(i==4||i==8||i==12){
//				number = number+" "+str.charAt(i);
//			}else
//			{
//				number = str+str.charAt(i);
//			}
//		}
//		return number;
		
		StringBuilder cardNumber = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i==4 || i==8 || i==12)
				cardNumber.append(" " + str.charAt(i));
			else
				cardNumber.append(str.charAt(i));
		}
		return cardNumber.toString();
	}

	

}
