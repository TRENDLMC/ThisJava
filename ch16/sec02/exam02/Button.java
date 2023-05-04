package ch16.sec02.exam02;

import lombok.Setter;

@Setter

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void cl() {
		this.clickListener.onClick();
	}
	 

}
