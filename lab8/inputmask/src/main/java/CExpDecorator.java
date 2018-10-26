
public class CExpDecorator implements IDecorator{

	

	@Override
	public String decorate(String str) {

		StringBuilder cardExp = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i==2)
				cardExp.append("/" + str.charAt(i));
			else
				cardExp.append(str.charAt(i));
		}
		return cardExp.toString();
	}

}
