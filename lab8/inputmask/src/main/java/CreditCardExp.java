/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String date = "";
	private IDecorator wrapped = null;

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (date.equals(""))
			return "[MM/YY]" + "  ";
		else if (wrapped == null) {

			return "[" + date + "]" + "  ";
		} else
			return "[" + wrapped.decorate(date) + "]" + "  ";
	}

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20)
			if(ch.matches("x|X") && date.length()>0) {
				date = date.substring(0, date.length()-1);
			}else
				
			date += ch;
		else if (nextHandler != null)
			nextHandler.key(ch, cnt);
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

	public void wrapDecorator(IDecorator d) {
		// TODO Auto-generated method stub
		this.wrapped = d;

	}

}